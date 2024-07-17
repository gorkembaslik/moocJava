import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<> ();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String n = scanner.nextLine();
            
            if (n.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int p = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pub = Integer.valueOf(scanner.nextLine());
            
            Book a = new Book(n,p,pub);
            bookList.add(a);
        }
        System.out.println("What information will be printed? ");
        String decision = scanner.nextLine();
        
        if (decision.equals("everything")){
            for (Book b : bookList ) {
                System.out.println(b);
            }
        } else if (decision.equals("name")){
            for (Book b : bookList){
                System.out.println(b.getName());
            }
        }
        
    }
}
