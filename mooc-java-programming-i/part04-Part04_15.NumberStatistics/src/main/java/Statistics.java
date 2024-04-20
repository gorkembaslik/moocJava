
public class Statistics {
    private int count=0, sum=0;
    
    public void addNumber(int no){
        this.sum += no;
        this.count++;
    }
    public int getCount(){
        return count;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        return count != 0 ? 1.0*sum/count : 0 ;
    }
}
