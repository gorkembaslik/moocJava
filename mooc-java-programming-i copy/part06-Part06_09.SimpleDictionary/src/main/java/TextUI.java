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


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary object){
        this.scanner = scanner;
        this.dictionary = object;
    }
    
    public void start(){
        String word, translation;
        while (true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                word = scanner.nextLine();
                if (dictionary.translate(word) == null){
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: "+dictionary.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
            
        }
    }
}
