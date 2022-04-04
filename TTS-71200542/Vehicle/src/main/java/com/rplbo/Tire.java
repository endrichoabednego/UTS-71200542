package com.rplbo;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;

    public Tire(String tireType, int width, int aspectRatio, int wheelDiameter){
        this.tireType=tireType;
        this.width=width;
        this.aspectRatio=aspectRatio;
        this.wheelDiameter=wheelDiameter;
    }

    public int getAspectRatio(){
        return aspectRatio;
    }

    public String getTireType(String tireType){
        return tireType;
    }







    public String getTireType() {
        return tireType;
    }
}

