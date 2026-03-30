package org.IRCTC;

import org.IRCTC.services.UserService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        UserService userService;
        try {
             userService = new UserService();
        }catch(IOException ex){
            System.out.println(ex);
        }

        int choice = 0;
        Scanner scan = new Scanner(System.in);
        while(choice != 1){
            System.out.println("Enter your choice");
            choice = scan.nextInt();
            System.out.println("1  Exit");
            System.out.println("2  Login");
            System.out.println("3  signin");

            switch (choice){
                case 2:{
                    System.out.println("Enter your name :");
                    String name = scan.next();
                    System.out.println("Enter the password :");
                    String password = scan.next();


                }
                case 3:{
                    System.out.println("Enter your name :");
                    String name = scan.next();
                    System.out.println("Enter the password :");
                    String password = scan.next();

                }
            }

        }



    }
}