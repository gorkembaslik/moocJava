
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = scanner.nextLine();
            
            if (text.equals("")){
                return;
            }
            
            String[] parts = text.split(" ");
            
            for (String word : parts){
                System.out.println(word);
                break;
            }
        }
    }
}
