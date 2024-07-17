/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Film {
    private String name;
    private int ageRating;
    
    //constructor
    
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    // methods
    
    public String name(){
        return name;
    }
    public int ageRating(){
        return ageRating;
    }
}
