package com.example;

public class Car{
    
    private String NumberPlate;
    private String CarColor;
    private String CarType;

    public Car(){
        this.NumberPlate="";
        this.CarColor="";
        this.CarType="";
    }
    public Car(String NumberPlate,String CarColor,String CarType){
        if(NumberPlate==null || CarColor==null ||CarType==null){
            throw new IllegalArgumentException("Args can't be null");
        }
        this.NumberPlate=NumberPlate;
        this.CarColor=CarColor;
        this.CarType=CarType;
    }
    public void setNumberPlate(String NumberPlate){
        this.NumberPlate=NumberPlate;
    }
    public void setCarColor(String CarColor){
        this.CarColor=CarColor;
    }
    public void setCarType(String CarType){
        this.CarType=CarType;
    }
    public String getNumberPlate(){
        return NumberPlate;
    }
    public String getCarColor(){
        return CarColor;
    }
    public String getCarType(){
        return CarType;
    }

}