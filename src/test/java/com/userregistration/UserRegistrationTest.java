package com.userregistration;

import org.junit.jupiter.api.Test;
public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkFirstName("Amit");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkLastName("Pradhan");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkEmail("abc-100@yahoo.com");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkPhoneNumber("91 6371912511");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkPassword("Amitranjan@1234");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
}
