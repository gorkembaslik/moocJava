/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */

import java.util.ArrayList;

public class Receipt {
    private String name;
    private int cookingTime;
    private ArrayList<String> incredients;
    
    public Receipt(String name, int cookingTime, ArrayList<String> incredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.incredients = incredients;
    }
    
    @Override
    public String toString(){
        return this.name+", cooking time: "+this.cookingTime;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIncredients(){
        return this.incredients;
    }
}
