/**
 * 
 */
package com.adevguide.java.regex;

import java.util.regex.Pattern;

/**
 * @author PraBhu
 *
 */
public class RegexExamples {

	public static void main(String[] args) {

		// Regex for emailId
		String emailIdRegex = "^[a-z0-9_+&*-]+(?:\\." + "[a-z0-9_+&*-]+)*@" + "(?:[a-z0-9-]+\\.)+[a-z]{2,7}$";

		String emailId = "prabhu.sites@gmail.com";
		// Case-insensitive search
		System.out.println(Pattern.compile(emailIdRegex, Pattern.CASE_INSENSITIVE).matcher(emailId).matches()); // true

	}

}
