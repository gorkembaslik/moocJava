
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int val = Integer.valueOf(scan.nextLine());
        if (val < 0){
            System.out.println("Grade: impossible!");
        } else if (val <= 49) {
            System.out.println("Grade: failed");
        } else if (val <= 59) {
            System.out.println("Grade: 1");
        } else if (val <= 69) {
            System.out.println("Grade: 2");
        } else if (val <= 79) {
            System.out.println("Grade: 3");
        } else if (val <= 89) {
            System.out.println("Grade: 4");
        } else if (val <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }
    }
}
