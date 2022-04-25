package com.Person;

public class Teacher extends Person {
    String degreeLevel;


    public Teacher(String firstName, String lastName, int age, String degreeLevel){
        super(firstName, lastName, age);
        this.degreeLevel = degreeLevel;
        
    }
    

    public Teacher(String firstName, String lastName, int age, String degreeLevel, String location){
        super(firstName, lastName, age, location);
        this.degreeLevel = degreeLevel;
    }

    public static void displayPerson(String firstName, String lastName, int age, String degreeLevel) {
        System.out.println("First Name: "+ firstName + " Last Name: " +lastName + " Age: " + age + " Degree Level:  " + degreeLevel);
        
    }
}
