
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date1 = new SimpleDate(24,3,2017);
        SimpleDate date2 = new SimpleDate(24,7,2017);
        
        Person leo = new Person("Leo", date1, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
    
        if (leo.equals(lily)){
            System.out.println("Is this correct?");
        }
        
        Person leoGainedWeight = new Person("Leo", date1, 62,10);
        
        if (leo.equals(leoGainedWeight)){
            System.out.println("Is this correct?");
        }
        
        Person twinLily = new Person("Lily", date2, 65, 8);
        
        if(lily.equals(twinLily)){
            System.out.println("twins!!");
        }
    }
}
