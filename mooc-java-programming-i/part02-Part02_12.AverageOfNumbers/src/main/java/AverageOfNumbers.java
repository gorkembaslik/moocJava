
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val == 0) {
                break;
            }
            
            sum += val;
            count++;
        }
        System.out.println("Average of the numbers: "+(sum/count));
    }
}
