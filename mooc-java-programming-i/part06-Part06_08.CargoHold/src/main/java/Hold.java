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

public class Hold {
    
    private ArrayList<Suitcase> holded;
    private int maxWeight;
    
    public Hold(int max){
        holded = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (total()+suitcase.totalWeight()>this.maxWeight){
            return;
        } else {
            holded.add(suitcase);
        }
    }
    
    public int total(){
        int sum = 0;
        for (Suitcase s : holded){
            sum+=s.totalWeight();
        }
        return sum;
    }
    
    public String toString(){
        if (holded.isEmpty()){
            return null;
        } else if (holded.size()==1){
            return "1 suitcase ("+total()+" kg)";
        } else {
            return holded.size()+" suitcases ("+total()+" kg)";
        }
    }
    
    public void printItems(){
        for (Suitcase s : holded){
            s.printItems();
        }
    }
    
}
