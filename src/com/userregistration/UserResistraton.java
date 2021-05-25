package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserResistraton {
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
	public static void main(String[] args) {
		System.out.println("Welcome To User Registration");
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter Your First Name : ");
		String firstname = input.nextLine();	 
	    System.out.println(usernameValidation(firstname));
	    System.out.print("Enter Your Last Name : ");
		String lastname = input.nextLine();	 
	    System.out.println(usernameValidation(lastname));
	}

}
