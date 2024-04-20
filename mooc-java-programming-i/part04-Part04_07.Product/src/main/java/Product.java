/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    // this is a constructor.
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQuantity;
        
    }
    
    // this is a method
    public void printProduct(){
        System.out.println(name+", price "+price+", "+quantity+" pcs");
    }
}
