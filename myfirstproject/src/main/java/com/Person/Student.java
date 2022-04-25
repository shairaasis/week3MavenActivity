package com.Person;

public class Student extends Person{

    int year;

    public Student(String firstName, String lastName, int age, int year){
        super(firstName, lastName, age);
        this.year = year;
        
    }


    public Student(String firstName, String lastName, int age, int year, String location){
        super(firstName, lastName, age, location);
        this.year = year;
    }

    public static void displayPerson(String firstName, String lastName, int age, int year) {
        System.out.println("First Name: "+ firstName + " Last Name: " +lastName + " Age: " + age + " Year:  " + year);
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
}
