package org.IRCTC.services;

import org.mindrot.jbcrypt.BCrypt;

public class Utility {

    public static String passwordEncoder(String password){
        return BCrypt.hashpw(password,BCrypt.gensalt());
    }

    public static boolean checkPassword(String password, String hashedPassword){
        return BCrypt.hashpw(password, BCrypt.gensalt()).equals(hashedPassword);
    }
}
