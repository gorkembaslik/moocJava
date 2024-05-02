/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */

public class Fitbyte {
    private int restingHeartRate;
    private int age;
    
    
    public Fitbyte(int age, int restingRate){
        this.restingHeartRate = restingRate;
        this.age = age;
    }
        
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - 0.711 * age;
        // System.out.println(age);
        // System.out.println(maxHeartRate);
        return (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
   
    
}
