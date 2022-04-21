package com.Person;

public class Teacher extends Person {
    String degreeLevel;


    public Teacher(String firstName, String lastName, int age, String degreeLevel){
        super(firstName, lastName, age);
        this.degreeLevel = degreeLevel;
        
    }
    
}
