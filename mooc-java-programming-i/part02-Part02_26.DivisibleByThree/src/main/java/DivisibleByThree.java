
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,6);
    }
    public static void divisibleByThreeInRange(int beg, int end){
        
        while (beg<=end){
            if (beg%3==0){
                System.out.println(beg);
            }
            
            beg++;
        }
    }
}
