/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String a, String b) {
        this.identifier = a;
        this.name = b;
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object to a Bird object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.identifier.equals(comparedItem.identifier);

        /*
        // the comparison of names above is equal to
        // the following code

        if (this.name.equals(comparedBird.name)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
        */
    }
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
}
