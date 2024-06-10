package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to the Parking Management System!");
        Car c=new Car("ABC1234","Red","Sedan");
        System.out.println(c.getNumberPlate());

        ParkingSpot ps=new ParkingSpot();
       // ParkingTicket pt=new ParkingTicket();
    }
}
