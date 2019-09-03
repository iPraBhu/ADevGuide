package com.adevguide.java.designpatterns.builder;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder("Pra", "Bhu") // mandatory parameters
                .addAge("25") // optional
                .addGender("M") // optional
                .addHasExperience(true) // optional
                .build(); // to get back student option

        System.out.println(student);

    }

}
