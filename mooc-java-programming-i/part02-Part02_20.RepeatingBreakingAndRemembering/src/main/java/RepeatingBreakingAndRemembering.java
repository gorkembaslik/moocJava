
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int countEven = 0, countOdd = 0;
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum += val;
            
            if (val%2==0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+(countEven+countOdd));
        System.out.println("Average: "+(double)sum/(countEven+countOdd));
        System.out.println("Even: "+countEven);
        System.out.println("Odd: "+countOdd);
    }
    
}
