
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        int side = Integer.valueOf(scanner.nextLine());
        Cube a = new Cube(side);
        System.out.println(a);
    }
}
