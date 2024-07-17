
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;
        
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val == 0) {
                break;
            } else if (val > 0) {
                sum += val;
                count++;
            }
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/count);
        }
        
    }
}
