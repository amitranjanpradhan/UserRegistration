package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {
    public String email;
    public  boolean expectedResult;
    public UserRegistration userRegistration;
    public UserRegistrationParameterizedTest(String email, boolean expectedResult){
        super();
        this.email=email;
        this.expectedResult=expectedResult;
    }

    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true}});
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueParameterisedTest(){
        System.out.println("This is Expected Result "+ this.expectedResult);
        Assert.assertEquals(this.expectedResult,userRegistration.checkEmail(this.email));
    }
}
