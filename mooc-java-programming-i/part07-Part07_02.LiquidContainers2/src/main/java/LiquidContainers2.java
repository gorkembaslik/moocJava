
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int val = Integer.valueOf(parts[1]);
            
            switch (command){
                case "add":
                    first.add(val);
                    break;
                case "move":
                    if (first.contains()>=val){
                        first.remove(val);
                        second.add(val);
                    } else {
                        second.add(first.contains());
                        first.remove(first.contains());
                    }
                    break;
                case "remove":
                    second.remove(val);
                    break;
                default:
                    System.out.println("wrong command");
            }
            
        }
    }

}
