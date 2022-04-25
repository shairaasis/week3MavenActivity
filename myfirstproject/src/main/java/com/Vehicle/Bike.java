package com.Vehicle;



public class Bike extends Vehicle{

    int wheelie_power;

    public Bike(String engineType, int no_Wheels, int wheelie_power){
        super(engineType, no_Wheels);
        this.wheelie_power = wheelie_power;

    }

    public Bike(String vehicleName, double gas, double gasConsumption, String engineType, int no_Wheels, int wheelie_power){
        super(vehicleName, gas, gasConsumption, engineType, no_Wheels);
        this.wheelie_power = wheelie_power;

    }

    public int getWheelie_power() {
        return wheelie_power;
    }

    public void setWheelie_power(int wheelie_power) {
        this.wheelie_power = wheelie_power;
    }

    
    
}
