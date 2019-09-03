package com.adevguide.java.designpatterns.builder;

public class Student {

    private String firstName; // mandatory
    private String lastName; // mandatory
    private String age; // optional
    private String gender; // optional
    private boolean isGraduate; // optional
    private boolean hasExperience; // optional
    private String city; // optional
    private String state; // optional
    private boolean isEarning; // optional

    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.isGraduate = builder.isGraduate;
        this.hasExperience = builder.hasExperience;
        this.city = builder.city;
        this.state = builder.state;
        this.isEarning = builder.isEarning;
    }

    @Override
    public String toString() {
        return " firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n gender=" + gender
                + "\n isGraduate=" + isGraduate + "\n hasExperience=" + hasExperience + "\n city=" + city + "\n state="
                + state + "\n isEarning=" + isEarning;
    }

    public static class StudentBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String gender;
        private boolean isGraduate;
        private boolean hasExperience;
        private String city;
        private String state;
        private boolean isEarning;

        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder addAge(String age) {
            this.age = age;
            return this;
        }

        public StudentBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder addisGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
            return this;
        }

        public StudentBuilder addHasExperience(boolean hasExperience) {
            this.hasExperience = hasExperience;
            return this;
        }

        public StudentBuilder addCity(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder addState(String state) {
            this.state = state;
            return this;
        }

        public StudentBuilder addIsEarning(boolean isEarning) {
            this.isEarning = isEarning;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
