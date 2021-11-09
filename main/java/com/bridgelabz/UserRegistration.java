package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose  - As a User need to enter a valid First Name
 * @name     - Pratik lahamge
 * @version - 11.0
 */

public class UserRegistration {
	public boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

}