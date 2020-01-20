package com.adevguide.java.simpleproject;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    System.out.println("\n\n***************************************\n\n");
    System.out.println("This Application is build using Docker.");
    System.out.println("Type Something and it will be displayed on the console.");
    Scanner in=new Scanner(System.in);
    String input=in.nextLine();
    System.out.println("You have entered :: "+input);
    System.out.println("\n\nOk Bye********************************\n\n");
    }
}
