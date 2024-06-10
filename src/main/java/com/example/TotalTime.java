package com.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class TotalTime{

    public TotalTime(){
    }

private static LocalDateTime parseDateTime(String date){
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
    return LocalDateTime.parse(date,formatter);
}
    public int[] CalculateTime(String enterdate,String exitdate,String entertime,
        String exittime){
            int a[]=new int[2];
        LocalDateTime e1=parseDateTime(enterdate+" "+entertime);
        LocalDateTime e2=parseDateTime(exitdate+" "+exittime);

        a[0]=(int) ChronoUnit.HOURS.between(e1,e2);
        a[1]=(int) ChronoUnit.MINUTES.between(e1,e2)%60;
    return a;
    }
    
}