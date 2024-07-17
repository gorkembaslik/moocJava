
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        
        while (!(text.equals(""))) {
            String[] pieces = text.split(" ");
        
            for (String part : pieces) {
                System.out.println(part);
            }
            text = scanner.nextLine();
        }
      
    }
}
