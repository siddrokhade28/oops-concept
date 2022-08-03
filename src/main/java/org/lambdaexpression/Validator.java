package org.lambdaexpression;

import java.util.regex.Pattern;

// Validator class to validate the inputs
public class Validator {

    //Regex for First Name and Last Name
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";
    //Regex for email
    private static final String emailregex = "^[A-za-z0-9]+([.+-][A-za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2})?$";
    //Regex for Phone Number
    private static final String phoneRegex = "^([+][0-9]{2})?[\\s]?[1-9][0-9]{9}$";
    //Regex for Password
    private static final String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-])[A-Za-z0-9@$!%*?&]{8,}$";

    //Lambda Function to Use validator
    static IValidator obj = (regex, userInput) -> {return Pattern.matches(regex, userInput);};

    // function to Validate First and Last Name
    public static boolean isValidName(String name) {
        return obj.validator(nameRegex, name);
    }

    //function to Validate Email Id
    public static boolean isValidEmail(String email) {
        return obj.validator(emailregex, email);
    }

    //function to Validate Phone Number
    public static boolean isValidPhoneNo(String phn) {
        return obj.validator(phoneRegex, phn);
    }

    ///function to Validate Password
    public static boolean isValidPassword(String password) {
        return obj.validator(passwordRegex, password);
    }

}
