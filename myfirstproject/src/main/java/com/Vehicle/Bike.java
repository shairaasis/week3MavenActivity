package com.Vehicle;



public class Bike extends Vehicle{

    int wheelie_power;

    public Bike(String engineType, int no_Wheels, int wheelie_power){
        super(engineType, no_Wheels);
        this.wheelie_power = wheelie_power;

    }
    
}
