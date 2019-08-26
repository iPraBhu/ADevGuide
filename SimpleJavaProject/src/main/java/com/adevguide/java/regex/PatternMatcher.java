/**
 * 
 */
package com.adevguide.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author PraBhu
 *
 */
public class PatternMatcher {

	public static void main(String[] args) {

		// Using Pattern class static method matches to match a regex against input
		// string
		// return true if string starts with 'T'
		System.out.println(Pattern.matches("T.*", "This is a sample string"));
		// returns true if date is passed in DD-MM-YYYY format
		System.out.println(Pattern.matches("(\\d{2}-){2}\\d{4}", "19-05-1894"));

		String testCase = "This is yet another \t sample text with \t multiple tabs(2) and multiple lines.\n"
				+ "Let me add 50 numbers also so we will have more test cases, \n"
				+ "looks like I have added only 1 number. Bummer!!";

		// create Pattern class object for new line regex
		Pattern pattern = Pattern.compile("\\n");
		// invoke pattern class split method and pass input string
		String[] result = pattern.split(testCase);
		int i = 0;
		// iterate and print split result with line number
		for (String s : result) {
			i++;
			System.out.println("line " + i + ": " + s);

		}

		// create Pattern class object for a digit
		pattern = Pattern.compile("\\d");
		// generate Matcher class object from pattern object and pass input string
		Matcher matcher = pattern.matcher(testCase);
		i = 0;
		while (matcher.find()) {
			i++;
			System.out.println(
					"Pattern exist for " + i + " time from index " + matcher.start() + " till index " + matcher.end());
		}

		// create Pattern class object for a digit
		pattern = Pattern.compile("aNoTHeR", Pattern.CASE_INSENSITIVE);
		// generate Matcher class object from pattern object and pass input string
		matcher = pattern.matcher(testCase);

		System.out.println(matcher.find());

	}

}
