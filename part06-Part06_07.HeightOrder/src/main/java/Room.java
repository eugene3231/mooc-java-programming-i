/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Room {
    private ArrayList<Person> roomies;

    public Room() {
        this.roomies = new ArrayList<>();
    }
    
    public void add(Person person) {
        roomies.add(person);
    }
    
    public boolean isEmpty() {
        return roomies.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.roomies;
    }
    
    public Person shortest() {
        if (this.roomies.isEmpty()) {
        return null;
        }

    // create an object reference for the object to be returned
    // its first value is the first object on the list
        Person returnObject = this.roomies.get(0);

    // go through the list
        for (Person prs: this.roomies) {
        // compare each object on the list
        // to the returnObject -- we compare heights
        // since we're searching for the tallest,

            if (returnObject.getHeight() > prs.getHeight()) {
            // if we find a taller person in the comparison,
            // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }

    // finally, the object reference describing the
    // return object is returned
        return returnObject;
    }
    public Person take() {
        Person xx = this.shortest();
        this.roomies.remove(xx);
        return xx;
    }
}
