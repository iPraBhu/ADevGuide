package com.adevguide.java.simpleproject;

import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {

		
		System.out.println(Pattern.matches("(Pra)\\1", "PraPra")); // true
		System.out.println(Pattern.matches("(Pra)(Bhu)\\2\\1", "PraBhuBhuPra")); // true
		System.out.println(Pattern.matches("(Pr)(a\\d)\\2\\1", "Pra1a1Pr")); // true

	}
}
