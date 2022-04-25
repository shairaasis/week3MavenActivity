package com.Person;

public class Student extends Person{

    int year;

    public Student(String firstName, String lastName, int age, int year){
        super(firstName, lastName, age);
        this.year = year;
        
    }

    public Student(String firstName, String lastName, int age, int year, String location, String travel_vehicle){
        super(firstName, lastName, age, location, travel_vehicle);
        this.year = year;
        
    }

    public Student(String firstName, String lastName, int age, int year, String location){
        super(firstName, lastName, age, location);
        this.year = year;
        this.travel_vehicle = "No Vehicle";
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
}
