package com.adevguide.java.problems;

public class ReverseInteger {

    public static void main(String[] args) {
        // Variable to hold input value
        Integer input = 123456;
        // Variable to hold reversed value
        Integer reverse = 0;
        // loop till input value becomes zero
        while (input != 0) {
            // multiple previous reverse value by 10 , add remainder to it and save it back
            // in reverse variable
            reverse = reverse * 10 + input % 10;
            // Divide input by 10 and store quotient value in input
            input = input / 10;
        }
        // Print reverse Value
        System.out.println("Reverse Integer ::" + reverse);
    }

}
