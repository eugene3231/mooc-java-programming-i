
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
    public String longest() {
    // return a null reference if there's no one on the ride
    if (this.elements.isEmpty()) {
        return null;
    }

    // create an object reference for the object to be returned
    // its first value is the first object on the list
    String returnObject = this.elements.get(0);

    // go through the list
    for (String prs: this.elements) {
        // compare each object on the list
        // to the returnObject -- we compare heights
        // since we're searching for the tallest,

        if (returnObject.length() < prs.length()) {
            // if we find a taller person in the comparison,
            // we assign it as the value of the returnObject
            returnObject = prs;
        }
    }

    // finally, the object reference describing the
    // return object is returned
    return returnObject;
}
}
