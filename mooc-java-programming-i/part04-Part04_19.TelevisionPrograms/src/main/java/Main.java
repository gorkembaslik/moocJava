import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()){
                break;
            }
            
            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram a = new TelevisionProgram(name, dur);
            programs.add(a);
        }
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram i : programs){
            if (i.getDuration()<=max){
                System.out.println(i);
            }
        }
    }
}
