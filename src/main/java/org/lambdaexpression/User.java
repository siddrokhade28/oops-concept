package org.lambdaexpression;

import java.util.regex.Pattern;

public class User {
    // pojo class to set all the Variables
    private String firstName;
    private String lastName;
    private String email;
    private String Phn;
    private String password;

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        try {
            if (Validator.isValidPassword(password)) {
                this.password = password;
            } else throw new CustomException("Enter valid password");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getPhn() {
        return Phn;
    }

    public void setPhn(String phn) {
        try {
            if (Validator.isValidPhoneNo(phn)) {
                Phn = phn;
            } else throw new CustomException("Enter valid phone Number");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            if (Validator.isValidEmail(email)) {
                this.email = email;
            } else throw new CustomException("Enter Valid email");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        try {
            if (Validator.isValidName(firstName)) {
                this.firstName = firstName;
            } else {
                throw new CustomException("Enter Valid First name");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        try {
            if (Validator.isValidName(lastName)) {
                this.lastName = lastName;
            } else {
                throw new CustomException("Enter Valid Last name");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phn='" + Phn + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
