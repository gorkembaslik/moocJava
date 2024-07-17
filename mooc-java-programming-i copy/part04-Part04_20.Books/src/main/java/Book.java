/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Book {
    private String title;
    private int pages;
    private int published;
    
    public Book (String title, int pages, int published){
        this.title = title;
        this.pages = pages;
        this.published = published;
    }
    
    public String getName(){
        return title;
    }
    
    public String toString(){
        return title + ", " + pages + " pages, " + published;
    }
}
