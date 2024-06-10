package com.example;

public class ScanTicket{

    public ScanTicket(){

    }
    public int checknumber(String inputnumber,String storenumber){
        if(inputnumber.equals(storenumber)){
            return 1;
        }
        return 0;
    }
    
}