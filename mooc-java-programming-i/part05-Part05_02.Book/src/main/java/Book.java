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
    private String author;
    private String name;
    private int pages;
    
    // constructor
    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    // methods
    
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author + ", " + this.name + ", " + pages + " pages";
    }
}
