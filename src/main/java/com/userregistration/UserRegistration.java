package com.userregistration;
import java.util.regex.*;
public class UserRegistration extends Throwable {
    private static boolean check;
    private String firstName,lastName,email,phoneNumber,password;
    /**
     * This checkFirstname method will check the user input according to the pattern.
     * for this operation i have imported regex module.
     */
    public static boolean checkFirstName(String firstName) throws UserRegistrationException{
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (!check) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * This checkLastname method will check the user input according to the pattern.
     */
    public static boolean checkLastName(String lastName) throws UserRegistrationException{
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        if (!check) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * Added checkEmail method to match the email ids according to the given pattern.
     */
    public static boolean checkEmail(String email) throws IllegalArgumentException{
        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\+*-*.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
        if (!check) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * This checkPhonenumber method will check the user input(Mobile Number) according to the pattern.
     */
    public static boolean checkPhoneNumber(String phoneNumber) throws UserRegistrationException{
        check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
        if (!check) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * Password must be of 8 characters.
     * Have one Uppercase Letter.
     * Have a Special Character(Eg-@$^)"
     * Must Have a Number.
     */
    public static boolean checkPassword(String password) throws UserRegistrationException{
        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,}.*$").matcher(password).matches();
        if (!check) {
            return false;
        }
        else {
            return true;
        }
    }
}
