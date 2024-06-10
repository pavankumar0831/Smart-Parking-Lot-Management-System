package com.example;

public class ParkingTicket{
    private String enterDate;
    private String enterTime;
    private Long CardNumber;
    private String CardType;
    private Integer SpotNumber;
    private Car car;

    public ParkingTicket(String enterDate,String enterTime,Long CardNumber,
                    String CardType,Integer SpotNumber,Car car){
        if(enterDate==null || enterTime==null || CardNumber==null || CardType==null
            || SpotNumber==null || car==null){
                throw new IllegalArgumentException("Args can't be null");
            }
        this.enterDate=enterDate;
        this.enterTime=enterTime;
        this.CardNumber=CardNumber;
        this.CardType=CardType;
        this.SpotNumber=SpotNumber;
        this.car=car;
    }

    public Car getAssignedCar(){
        return car;
    }
    public void setAssignedCar(Car car){
        this.car=car;
    }
    public String getDate(){
        return enterDate;
    }
    public void setDate(String enterDate){
        this.enterDate=enterDate;
    }
    public String getTime(){
        return enterTime;
    }
    public void setTime(String enterTime){
        this.enterTime=enterTime;
    }
    public long getCardNumber(){
        return CardNumber;
    }
    public void setCardNumber(Long CardNumber){
        this.CardNumber=CardNumber;
    }
    public String getCardType(){
        return CardType;
    }
    public void setCardType(String CardType){
        this.CardType=CardType;
    }
    public int getSpotNumber(){
        return SpotNumber;
    }
    public void setSpotNumber(Integer SpotNumber){
        this.SpotNumber=SpotNumber;
    }
}