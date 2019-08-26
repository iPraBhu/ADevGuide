/**
 * 
 */
package com.adevguide.java.regex;

/**
 * @author prabhu
 *
 */
public class RegularExpressions {

	public static void main(String[] args) {

		String pattern = "(\\+\\d{2})(\\s)(\\d{10})"; // Java Regex to match +xx xxxxxxxxxx
		String testCase = "+91 8308767656";
		System.out.println(testCase.matches(pattern)); // this will print true

		String pattern1 = "(\\+\\d{2})(\\s)(\\d{10})";
		String testCase1 = "+91 8308767656";
		System.out.println(testCase1.replaceAll(pattern1, "$3")); // this will print 8308767656
		System.out.println(testCase1.replaceAll(pattern1, "$1$3")); // this will print pattern string without the space
																	// in between i.e +918308767656

		String pattern2 = "(?i)(PraBhu)";
		String testCase2 = "PRABHU";
		System.out.println(testCase2.matches(pattern2)); // this will return true
		testCase2 = "prabhu";
		System.out.println(testCase2.matches(pattern2)); // this will return true
		

		String testCase11 = "This is a sample text with below 100 sample words to serve the purpose.";
		// Checks if the String contains "sample"
		String pattern11 = ".*(sample).*";
		// Checks if the String contains "Sample"
		String pattern22 = ".*(Sample).*";
		// Checks if the String contains three character digit
		String pattern3 = ".*\\d{3}.*";
		// Checks if the String starts with 'T' and ends with '.'.
		String pattern4 = "T.*.";
		// pattern to three character digit
		String pattern5 = "\\d{3}";
		// pattern to detect word 6 character word which starts with 's' and ends with
		// 'e'
		String pattern6 = "s.{4}e";

		System.out.println(testCase11.matches(pattern11)); // true

		System.out.println(testCase11.matches(pattern22)); // false

		System.out.println(testCase11.matches(pattern3)); // true

		System.out.println(testCase11.matches(pattern4));// true

		String[] output = testCase11.split(pattern5);
		for (String s : output) {
			System.out.println(s);
		}
		// This is a sample text with below
		// sample words to serve the purpose.

		System.out.println(testCase11.replaceFirst(pattern6, "new")); // This is a new text with below 100 sample words to
																	// serve the purpose.

		System.out.println(testCase11.replaceAll(pattern6, "new")); // This is a new text with below 100 new words to
																	// serve the purpose.
		
		

	}

}
