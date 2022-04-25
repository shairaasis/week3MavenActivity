package com.Vehicle;

public class Vehicle {

    
    String engineType, vehicleName;
    double gas, gasConsumption;
    int no_Wheels;

    public Vehicle(String engineType, int no_Wheels){
        this.engineType = engineType;
        this.no_Wheels = no_Wheels;
    }

    public Vehicle(String vehicleName, double gas, double gasConsumption, String engineType, int no_Wheels){
        this.vehicleName=vehicleName;
        this.gas=gas;
        this.gasConsumption=gasConsumption;
        this.engineType = engineType;
        this.no_Wheels = no_Wheels;

    }


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getNo_Wheels() {
        return no_Wheels;
    }

    public void setNo_Wheels(int no_Wheels) {
        this.no_Wheels = no_Wheels;
    }


    
}
