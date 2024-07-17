import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        
        printFromNumberToOne(n);
    }
    
    public static void printFromNumberToOne(int number) {
        
        while (number>0){
            System.out.println(number--);
        }
    }

}
