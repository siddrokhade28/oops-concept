package org.lambdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserApp {
    public static void main(String[] args) {
        //creating object of the pojo class to set values
        User newUser = new User();
        Validator obj = new Validator();
        //scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName = scanner.next();
        newUser.setFirstName(firstName);
        System.out.println("Enter Last name");
        String lastName = scanner.next();
        newUser.setLastName(lastName);
        System.out.println("Enter Email ID");
        String email = scanner.next();
        newUser.setEmail(email);
        System.out.println("Enter Phone Number");
        String phn = scanner.next();
        newUser.setPhn(phn);
        System.out.println("Enter password");
        String password = scanner.next();
        newUser.setPassword(password);
    }
}
