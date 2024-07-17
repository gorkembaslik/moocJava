
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrenClinic = new HealthStation();
        
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
        
        System.out.println(ethan.getName() + "'s weight: " + childrenClinic.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrenClinic.weigh(peter) + " kilos");
        
        System.out.println("weighings performed: "+ childrenClinic.weighings());
        // feed
        
        childrenClinic.feed(ethan);
        childrenClinic.feed(ethan);
        childrenClinic.feed(ethan);
        
        System.out.println("");
        
        System.out.println(ethan.getName() + "'s weight: " + childrenClinic.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrenClinic.weigh(peter) + " kilos");
        
        // weigh
        childrenClinic.weigh(ethan);
        childrenClinic.weigh(peter);
        
        System.out.println("weighings performed: "+ childrenClinic.weighings());
        
        childrenClinic.weigh(ethan);
        childrenClinic.weigh(ethan);
        childrenClinic.weigh(ethan);
        childrenClinic.weigh(ethan);
        
        System.out.println("weighings performed: "+ childrenClinic.weighings());
    }   
    
}
