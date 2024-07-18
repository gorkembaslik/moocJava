/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    private String birdName, nameInLatin;
    
    public UserInterface(Scanner scan){
        this.scanner = scan;
        birds = new ArrayList<>();
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "Add":
                    System.out.println("Name:");
                    birdName = scanner.nextLine();
                    System.out.println("Name in Latin:");
                    nameInLatin = scanner.nextLine();
                    Bird b = new Bird(birdName, nameInLatin);
                    birds.add(b);
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    birdName = scanner.nextLine();
                    for (Bird ba: birds){
                        if (ba.getName().equals(birdName)){
                            ba.observation++;
                        }
                    }
                    break;
                case "All":
                    for (Bird ba: birds){
                        System.out.println(ba);
                    }
                    break;
                case "One":
                    System.out.println("Bird?");
                    birdName = scanner.nextLine();
                    for (Bird ba: birds){
                        if (ba.getName().equals(birdName)){
                            System.out.println(ba);
                        }
                    }
                    break;
                case "Quit":
                    return;
                default:
                    System.out.println("Wrong command");
            }
        }
    }
    
}
