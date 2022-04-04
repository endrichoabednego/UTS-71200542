package com.rplbo;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String fuelType, int capacity){
        this.fuelType=fuelType;
        this.capacity=capacity;
    }

    public String getFuelType(){
        return fuelType;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
}
