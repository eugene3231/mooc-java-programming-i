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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int currWeight = 0;
        for (Item i : this.items) {
            currWeight += i.getWeight();
        }
        if (currWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        int currWeight = 0;
        for (Item i : this.items) {
            currWeight += i.getWeight();
        }
        if (items.size() == 0) {
            return "no items (" + currWeight + " kg)";
        } else if (items.size() == 1) {
            return "1 item (" + currWeight + " kg)";
        } else {
            return items.size() + " items (" + currWeight + " kg)";
        }
    }
    public void printItems() {
        for(Item i: items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int currWeight = 0;
        for (Item i : this.items) {
            currWeight += i.getWeight();
        }
        return currWeight; 
    }
    
    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }
        Item ii = this.items.get(0);
        
        for(Item i : items) {
            if(i.getWeight() > ii.getWeight()) {
                ii = i;
            }
        }
        return ii;
    }
    
}
