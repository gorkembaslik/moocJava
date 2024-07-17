/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Functionality {
    private ArrayList<Receipt> receipts;
            
    public Functionality(){
        receipts = new ArrayList<>();
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()){
                String name = scan.nextLine();
                if (name.isBlank()){
                    continue;
                }
                int cookingTime = Integer.valueOf(scan.nextLine());
                ArrayList<String> incredients = new ArrayList<>();
                while (scan.hasNextLine()){
                    String row = scan.nextLine();
                    if (row.isEmpty()){
                        break;
                    }
                    incredients.add(row);
                }
                Receipt r = new Receipt(name,cookingTime,incredients);
                receipts.add(r);
            } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break;
            } else if (command.equals("list")){
                
                System.out.println("Recipes:");
                for (Receipt r: receipts){
                    System.out.println(r);
                }
            } else if (command.equals("find name")){
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                
                System.out.println("Recipes:");
                for (Receipt r: receipts){
                    if (r.getName().contains(name)){
                        System.out.println(r);
                    }
                }
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                
                System.out.println("Recipes:");
                for (Receipt r: receipts){
                    if (r.getTime()<= time){
                        System.out.println(r);
                    }
                }
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String inc = scanner.nextLine();
                
                System.out.println("Recipes:");
                for (Receipt r: receipts){
                    if (r.getIncredients().contains(inc)){
                        System.out.println(r);
                    }
                }
            }
        }
        
    }
    
    
}
