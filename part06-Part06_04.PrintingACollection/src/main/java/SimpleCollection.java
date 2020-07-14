
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

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String e = "elements:" + "\n";
            String xx = "The collection " + this.name + " has " + elements.size() + " ";
            if (elements.size() == 1 ) {
                e = "element:" + "\n";
                return xx + e + elements.get(0);
            } else {
                xx += e;
                for (String s: elements) {
                    xx += s + "\n";
                }
                return xx;
            }
            
            
        }
    }
    
}
