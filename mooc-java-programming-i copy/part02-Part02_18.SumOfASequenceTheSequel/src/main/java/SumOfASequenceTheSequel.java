
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println("The sum is: "+sum);
    }
}
