
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int val = Integer.valueOf(scanner.nextLine());
        
        if (val < 0){
            System.out.println(val*-1);
        } else {
            System.out.println(val);
        }
    }
}
