package org.IRCTC.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.IRCTC.entity.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


public class UserService
{

    private List<User> userList;

    private User user;

    private static final ObjectMapper objectmapper = new ObjectMapper();

    private static final String USERS_PATH = "src/main/java/org/IRCTC/localDB/User.json";

    public UserService(User user) throws IOException {
        this.user = user;
        loadUsers();
    }

    public UserService() throws IOException{
        loadUsers();
    }

    public void loadUsers() throws IOException{

        File users = new File(USERS_PATH);
        userList =  objectmapper.readValue(users, new TypeReference<List<User>>() {});

    }

    public boolean login(){

        Optional<User> finduser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) &&
                    Utility.checkPassword(user1.getPassword(),user.getHashed_password());
        }).findFirst();
        return finduser.isPresent();
    }

    public boolean signup(User user){
        try
        {
            userList.add(user);
            saveUserListToDB();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    private void saveUserListToDB() throws IOException {
        File userFile = new File(USERS_PATH);
        objectmapper.writeValue(userFile,userList);
    }


}
