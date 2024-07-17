/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Container {
    private int amount;
    
    public Container (){
        this.amount = 0;
    }
    
    public int contains(){
        return this.amount;
    }
    
    public void add(int val){
        if (val>0){
            if (this.amount+val<=100){
                this.amount+= val;
            } else {
                this.amount = 100;
            }
        }
    }
    
    public void remove(int val){
        if (this.amount-val<0){
            this.amount = 0;
        } else {
            this.amount -= val;
        }
    }
    
    public String toString(){
        return this.amount+"/100";
    }
}
