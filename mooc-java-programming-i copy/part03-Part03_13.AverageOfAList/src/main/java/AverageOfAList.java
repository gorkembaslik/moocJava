
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("First");
        
        list.remove("First");
        list.remove("First");

        System.out.println("Index 0 so the first value: " + list.get(0));
        //System.out.println("Index 1 so the second value: " + list.get(1));
    }
}
