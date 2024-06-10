package com.example;

public class Payment{

    private float HourAmount;
    private float TotalAmountForHour;
    private float TotalAmountForMinute;
    public Payment(){
    }
    public float TotalAmount(int Hour,int Minute){
        float amnt=30*Hour;
        TotalAmountForHour=amnt;
        if(Minute>=1 && Minute<=14) amnt+=10;
        else if(Minute>=15 && Minute<=29) amnt+=15;
        else if(Minute>=30 && Minute<=59) amnt+=20;
        else {
            amnt+=(30*(Minute/60));
            TotalAmountForHour+=(30*(Minute/60));
        }
        return amnt;
    }
    
}