package com.Vehicle;

public class Vehicle {

    
    String engineType;
    int no_Wheels;

    public Vehicle(String engineType, int no_Wheels){
        this.engineType = engineType;
        this.no_Wheels = no_Wheels;
    }


    public static void displayVehicle(String engineType, int no_Wheels, double storageCapacity) {
        System.out.println("Engine Type : "+ engineType + "\nNumber of Wheels    : " +no_Wheels + "\nStorage Capacity      : " + storageCapacity);
        
    }

    public static void displayVehicle(String engineType, int no_Wheels, int wheelie_power) {
        System.out.println("Engine Type :   "+ engineType + "\nNumber of Wheels     : " +no_Wheels +  "\nWheelie Power    : " + wheelie_power +"\n");
        
    }


    
}
