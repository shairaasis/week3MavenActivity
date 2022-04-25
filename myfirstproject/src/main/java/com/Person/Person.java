package com.Person;
import java.util.Scanner;
import com.Vehicle.Vehicle;

public class Person {
    String firstName, lastName;
    private String location;
    String travel_vehicle;
    int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String location, String travel_vehicle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.travel_vehicle = travel_vehicle;
        
    }

    public Person(String firstName, String lastName, int age, String location){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.travel_vehicle = "No Vehicle";
        
    }

    public void travel(Vehicle vehicleName){
        System.out.println("The person "+ getFirstName() + " " + getLastName()+" is currently in "+getLocation() +".");
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the location you want to travel to: ");
        String newLocation = sc.nextLine();
        System.out.print("Enter the distance(km) from your current location to destination: ");
        double distance = sc.nextDouble();

        double gasUsed = distance / vehicleName.getGasConsumption();

        if(gasUsed < vehicleName.getGas()){
            setLocation(newLocation);
            setTravel_vehicle(vehicleName.getVehicleName());
            vehicleName.setGas(vehicleName.getGas() - gasUsed);
            System.out.println("The person "+ getFirstName() + " " + getLastName()+" travelled to "+getLocation() +" using " +getTravel_vehicle());


        }
        
        else{
            System.out.println("Cannot travel.");
            System.out.println("Your vehicle " +vehicleName.getVehicleName() + " does not have enough gas.");

        }
        System.out.println("-------------------------------------------------------------------------------------------------------");

    }

    public void travel(){
        System.out.println("The person "+ getFirstName() + " " + getLastName()+" is currently in "+getLocation() +".");
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the location you want to travel to: ");
        String newLocation = sc.nextLine();
        setLocation(newLocation);
        System.out.print("Enter the distance(km) from your current location to destination: ");
        double distance = sc.nextDouble();
        System.out.println("The person "+ getFirstName() + " " + getLastName()+" travelled to "+getLocation() +" using " +getTravel_vehicle());
        System.out.println("-------------------------------------------------------------------------------------------------------");
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTravel_vehicle() {
        return travel_vehicle;
    }

    public void setTravel_vehicle(String travel_vehicle) {
        this.travel_vehicle = travel_vehicle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    


    
}
