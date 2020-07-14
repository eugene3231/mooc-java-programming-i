
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    
    public void add(String value) {
        this.items.add(value);
    }
    
    public ArrayList<String> values() {
        return this.items;
    }
    
    public String take() {
        String xx = this.items.get(items.size()-1);
        items.remove(items.size()-1);
        return xx;
    }
}
