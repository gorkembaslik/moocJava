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

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        String command, nexTask;
        int r;
        while (true) {
            System.out.println("Command:");
            command = scanner.nextLine();
            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    nexTask = scanner.nextLine();
                    list.add(nexTask);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    r = Integer.valueOf(scanner.nextLine());
                    list.remove(r);
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
}
