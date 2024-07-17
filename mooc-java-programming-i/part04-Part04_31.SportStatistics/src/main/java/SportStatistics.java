
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String team = scan.nextLine();
            int games = 0, loss = 0, win = 0;
            
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                
                if (row.isEmpty()){
                    continue;
                }
                
                if (row.contains(team)){
                    games++;
                    String[] parts = row.split(",");
                    if (parts[0].equals(team) && Integer.valueOf(parts[2])>Integer.valueOf(parts[3])) {
                        win++;
                    } else if (parts[1].equals(team) && Integer.valueOf(parts[2])<Integer.valueOf(parts[3])){
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
            
            System.out.println("Games: "+games);
            System.out.println("Wins: "+win);
            System.out.println("Losses: "+loss);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
