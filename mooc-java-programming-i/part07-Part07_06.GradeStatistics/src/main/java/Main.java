
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Average av = new Average();
        
        System.out.println("Enter point totals, -1 stops: ");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            }
            av.add(num);
        }
        av.print();
    }
}
        
        /*
        ArrayList<Integer> list = new ArrayList<>();
        Average av = new Average(list);
        int[] distribution = {0,0,0,0,0,0};
        int i, y;
        String s;
        System.out.println("Enter point totals, -1 stops");
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if (a == -1){
                System.out.println("Point average (all): "+av.get());
                System.out.println("Point average (passing): "+av.getPass());
                System.out.println("Pass percentage: "+av.passPercentage());
                System.out.println("Grade distribution:");
                for (i=5;i>=0;i--){
                    y = distribution[i];
                    s = "";
                    while (y>0){
                        s+="*";
                        y--;
                    }
                    System.out.println(i+": "+s);
                }
                return;
            } else if (a>=0){
                if (a<50) {
                    list.add(a);
                    distribution[0]++;
                } else if (a<60) {
                    list.add(a);
                    distribution[1]++;
                } else if (a<70){
                    list.add(a);
                    distribution[2]++;
                } else if (a<80){
                    list.add(a);
                    distribution[3]++;
                } else if (a<90){
                    list.add(a);
                    distribution[4]++;
                } else if (a<=100){
                    list.add(a);
                    distribution[5]++;
                }
            }
        }
        */
