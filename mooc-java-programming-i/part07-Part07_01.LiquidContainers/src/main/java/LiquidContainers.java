
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        int first_amount = 0;
        int second_amount = 0;
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("First: "+first_amount+"/100");
            System.out.println("Second: "+second_amount+"/100");
            System.out.println("");
            System.out.println("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int value = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (value>0){
                    if (first_amount+value<=100){
                        first_amount+= value;
                    } else {
                        first_amount = 100;
                    }
                }
            } else if (command.equals("move")) {
                if (first_amount>=value){
                    first_amount -=value;
                    if (second_amount+value<=100){
                        second_amount+= value;
                    } else {
                        second_amount = 100;
                    }
                } else {
                    if (second_amount+first_amount<=100){
                        second_amount+= first_amount;
                    } else {
                        second_amount = 100;
                    }
                    first_amount=0;
                }
            } else if (command.equals("remove")){
                if (second_amount-value<0){
                    second_amount = 0;
                } else {
                    second_amount -= value;
                }
            } else {
                System.out.println("Wrong command");
            }
        }
    }
    
}
