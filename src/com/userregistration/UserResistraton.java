package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserResistraton {
	/**
	 * usernameValidation is the function of boolean type 
	 * check that the 1st letter must be in upper case
	 * check that minimum character will be in there
	 * @param name
	 * @return true or false value
	 */
	public static boolean usernameValidation(String name) 
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();	 
	}
	/**
	 * email is a function checks the email validity
	 * there are 3 mandatory  field abc , bridglabz , co
	 * two optional field   
	 */
	public static void email()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String email = sc.nextLine();
		String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
		System.out.println("The email is: " + email);
	    System.out.println("Check the email is correct? " + email.matches(regex));
	}
	/**
	 * mobileNumValidation is a function to check the valid mobile number
	 * @param mobileNum
	 * @return the boolean value either true or false
	 * checking the country code  and 10 digit number must be there
	 */
	public static boolean mobileNumValidation(String mobileNum) {
		String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(mobileNumber);		
		Matcher m = p.matcher(mobileNum);
		return m.matches();
	}
	/**
	 * passwordValidation is a function to check password validation
	 * @param password
	 * @return boolean value 
	 * password validation part 1 is enter minimum 8 characters
	 * password validation part 2 is having minimum 1 upper case character.
	 * password validation part 3 is having minimum 1 numeric value.
	 * password validation part 4 is having exactly 1 special character.
	 */
	public static boolean passwordValidation(String password) 
	{
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern p = Pattern.compile(regex);
		if ( password == null ){
			return false;
		}
		Matcher m = p.matcher(password);
		
		return m.matches();
	}
	/**
	 * in main method taking the input from the user to validate
	 * calling the function to perform.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To User Registration");
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter Your First Name : ");
		String firstname = input.nextLine();	 
	    System.out.println(usernameValidation(firstname));
	    System.out.print("Enter Your Last Name : ");
		String lastname = input.nextLine();	 
	    System.out.println(usernameValidation(lastname));
	    email();
	    System.out.print("Enter Your Mobile Number : ");
		String mobileNumber = input.nextLine();	 
	    System.out.println(mobileNumValidation(mobileNumber));
	    System.out.print("Enter Your Password : ");
		String password = input.nextLine();	 
	    System.out.println(passwordValidation(password));
	}

}
