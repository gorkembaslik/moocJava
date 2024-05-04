
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        ArrayList<Item> archive1 = new ArrayList<>();
        
        String id;
        String name;
        
        while (true){
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if (id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            Item a = new Item(id, name); 
            if (!(archive.contains(a))){
                archive1.add(a);
            }
            archive.add(a);
        }
        
        for (Item b : archive1){
            System.out.println(b.getId()+": "+b.getName());
        }
        
    }
}
