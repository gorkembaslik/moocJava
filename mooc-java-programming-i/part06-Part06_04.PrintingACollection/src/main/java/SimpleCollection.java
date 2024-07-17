
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        } else {
            String a= "";
            if (elements.size()>1){
                a =a+"The collection "+this.name+" has "+elements.size()+" elements:\n";
            } else {
                a =a+"The collection "+this.name+" has "+elements.size()+" element:\n";
            }
            for (String s : elements){
                if (elements.size()>1){
                    a = a+s+ "\n";
                } else {
                    a = a+s;
                }
            }
            return a;
        }
    }   
    
}
