
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String oldn = "";
        while(true){
            String data = scanner.nextLine();
            
            if (data.equals("")){
                break;
            }
            
            String[] parts = data.split(",");
            
            if (Integer.valueOf(parts[1])>oldest){
                oldest = Integer.valueOf(parts[1]);
                oldn = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: "+oldn);
    }
}
