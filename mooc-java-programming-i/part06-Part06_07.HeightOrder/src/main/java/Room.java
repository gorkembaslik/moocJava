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

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<> ();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if (persons.isEmpty()){
            return null;
        }
        
        Person smallest = persons.get(0);
        
        for (Person p : persons) {
            
            if (p.getHeight()<smallest.getHeight()){
                smallest = p;
            }
            
        }
        return smallest;
    }
    
    public Person take(){
        if (persons.isEmpty()){
            return null;
        }
        Person p = shortest();
        persons.remove(p);
        return p;
    }
    
}
