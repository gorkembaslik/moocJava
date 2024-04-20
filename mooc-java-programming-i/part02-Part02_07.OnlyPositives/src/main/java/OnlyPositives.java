
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            if (val < 0) { 
                System.out.println("Unsuitable number");
            } else if (val == 0) {
                break;
            } else {
                System.out.println(val*val);
            }
        }
    }
}
