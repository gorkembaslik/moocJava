import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        Scanner scanner = new Scanner(System.in);
        
        division(3,5);
        // division(3, 5);
    }
   
    // implement the method here
    public static void division(int val1, int val2){
        
        System.out.println((double)val1/val2);
    }
}
