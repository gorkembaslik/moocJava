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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max){
        items = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addItem(Item item){
        if (totalWeight()+item.getWeight()>this.maxWeight){
            return;
        }
        items.add(item);
    }
    
    public String toString(){
        if (items.isEmpty()){
            return "no items ("+totalWeight()+"kg)";
        } else if (items.size()==1){
            return "1 item ("+totalWeight()+"kg)";
        } else {
            return this.items.size()+" items ("+totalWeight()+"kg)";
        }
    }
    
    public void printItems(){
        for (Item i : items){
            System.out.println(i.getName()+" ("+i.getWeight()+" kg)");
        }
    }
    
    public int totalWeight(){
        int sum=0;
        for (Item i : items){
            sum+=i.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item i : items){
            if (i.getWeight()>heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
