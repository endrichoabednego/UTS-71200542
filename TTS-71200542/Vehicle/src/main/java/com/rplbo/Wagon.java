package com.rplbo;

public abstract class Wagon implements Vehicle {
    private String pullers;
    private Wheel wheel;

    public Wagon(String pullers, Wheel wheel){
        this.pullers=pullers;
        this.wheel=wheel;
    }

    public String getPullers(){
        return pullers;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setPullers(String pullers){
        this.pullers=pullers;
    }

}

