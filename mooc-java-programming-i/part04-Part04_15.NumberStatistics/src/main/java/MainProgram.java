
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsE = new Statistics();
        Statistics statisticsO = new Statistics();
        
        int a;
        System.out.println("Enter numbers: ");
        while(true){
            a = Integer.valueOf(scanner.nextLine());
            if (a == -1) {
                break;
            }
            if (a % 2 == 0){
                statisticsE.addNumber(a);
            } else {
                statisticsO.addNumber(a);
            }
            statistics.addNumber(a);
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: "+ statisticsE.sum());
        System.out.println("Sum of odd numbers: "+ statisticsO.sum());
    }
}
