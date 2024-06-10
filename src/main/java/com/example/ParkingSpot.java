package com.example;

public class ParkingSpot{
    public int arr[]=new int[10];
    public ParkingSpot(){
        for(int i=0;i<10;i++){
            this.arr[i]=0;
        }
    }

    public int SpotNum(){
        int spot=-1;
        for(int i=0;i<10;i++){
            if(arr[i]==0) {
                spot=i+1;
                arr[i]=i+1;
                break;
            }
        }
        return spot;
    }
    public int FreeSpot(int num){
        arr[num-1]=0;
        return num;
    }
    public int checkOccupiedSpots(){
        int cnt=0;
        for(int i=0;i<10;i++){
            if(arr[i]!=0) cnt++;
        }
        return cnt;
    }
    public void printSpotStatus(){
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}