
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        Money c = a.plus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        Money d = new Money(3,0);
        
        System.out.println(a.lessThan(d));
        System.out.println(d.lessThan(b));
    }
}
