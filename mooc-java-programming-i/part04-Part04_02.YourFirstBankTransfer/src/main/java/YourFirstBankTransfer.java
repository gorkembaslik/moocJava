
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account ma = new Account("Matthews account", 1000);
        Account my = new Account("My account", 0);
        
        ma.withdrawal(100);
        
        my.deposit(100);
        
        System.out.println(ma);
        System.out.println(my);
        
    }
}
