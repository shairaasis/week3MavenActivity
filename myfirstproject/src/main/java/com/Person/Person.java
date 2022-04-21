package com.Person;

public class Person {
    String firstName, lastName;
    int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public static void displayPerson(String firstName, String lastName, int age) {
        System.out.println("First Name: "+ firstName + " Last Name: " +lastName + " Age: " + age);
        
    }

    public static void displayPerson(String firstName, String lastName, int age, int year) {
        System.out.println("First Name: "+ firstName + " Last Name: " +lastName + " Age: " + age + " Year:  " + year);
        
    }

    public static void displayPerson(String firstName, String lastName, int age, String degreeLevel) {
        System.out.println("First Name: "+ firstName + " Last Name: " +lastName + " Age: " + age + " Degree Level:  " + degreeLevel);
        
    }
    
}
