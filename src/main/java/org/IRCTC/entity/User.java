package org.IRCTC.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class User {

    private String name;

    private String password;

    private String hashed_password;

    private List<Ticket> tickets_booked;

    private String user_id;


    public User(){

    }

    public User(String name, String password, String hashed_password,
                List<Ticket> tickets_booked, String userId){
        this.name = name;
        this.password = password;
        this.hashed_password = hashed_password;
        this.tickets_booked = tickets_booked;
        this.user_id = userId;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setHashed_password(String hashed_password){
        this.hashed_password = hashed_password;
    }

    public String getHashed_password(){
        return hashed_password;
    }

    public List<Ticket> getTickets_booked() {
        return tickets_booked;
    }

    public void setTickets_booked(List<Ticket> tickets_booked) {
        this.tickets_booked = tickets_booked;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String userId) {
        this.user_id = userId;
    }
}
