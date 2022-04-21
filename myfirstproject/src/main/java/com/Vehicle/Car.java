package com.Vehicle;



public class Car extends Vehicle{

    double storageCapacity;

    public Car(String engineType, int no_Wheels, double storageCapacity){
        super(engineType, no_Wheels);
        this.storageCapacity = storageCapacity;

    }
    
}
