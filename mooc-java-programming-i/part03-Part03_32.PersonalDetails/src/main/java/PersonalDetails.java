
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, len = 0, count=0;
        String longest = "";
        while(true){
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            }
            
            String[] parts = text.split(",");
            
            sum+= Integer.valueOf(parts[1]);
            count++;
            if (parts[0].length()>len){
                len = parts[0].length();
                longest = parts[0];
            }
        }
        
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+ 1.0*sum/count);
    }
}
