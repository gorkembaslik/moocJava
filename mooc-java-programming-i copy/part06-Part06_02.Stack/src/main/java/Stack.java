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

public class Stack {
    
    private ArrayList<String> lele;
    
    public Stack(){
        lele = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return lele.isEmpty();
    }
    
    public void add(String value){
        lele.add(value);
    }
    
    public ArrayList<String> values(){
        return lele;
    }
    
    public String take(){
        String s = lele.get(lele.size()-1);
        lele.remove(s);
        return s;
    }
    
}
