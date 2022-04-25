package com.Vehicle;



public class Car extends Vehicle{

    double storageCapacity;

    public Car(String engineType, int no_Wheels, double storageCapacity){
        super(engineType, no_Wheels);
        this.storageCapacity = storageCapacity;

    }

    public Car(String vehicleName, double gas, double gasConsumption, String engineType, int no_Wheels, double storageCapacity){
        super(vehicleName, gas, gasConsumption, engineType, no_Wheels);
        this.storageCapacity = storageCapacity;

    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }



    

    
}
