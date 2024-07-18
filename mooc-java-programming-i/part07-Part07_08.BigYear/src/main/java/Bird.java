/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Bird {
    private String name, latiName;
    public int observation;
    
    public Bird(String name, String latiName){
        this.name = name;
        this.observation = 0;
        this.latiName= latiName;
    }
    
    @Override
    public String toString(){
        return name+" ("+latiName+"): "+observation;
    }
    
    public String getName(){
        return this.name;
    }
}
