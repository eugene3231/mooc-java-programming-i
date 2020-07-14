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
public class Hold {
    private ArrayList<Suitcase> holding;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holding = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        int currWeight = 0;
        for (Suitcase s : this.holding) {
            currWeight += s.totalWeight();
        }
        if (currWeight + suitcase.totalWeight() <= this.maxWeight) {
            holding.add(suitcase);
        }
    }
    
    public String toString() {
        int currWeight = 0;
        for (Suitcase s : this.holding) {
            currWeight += s.totalWeight();
        }
        return this.holding.size() + " suitcases (" + currWeight + " kg)";
    }
    
    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:\n");
        for (Suitcase s : this.holding) {
            s.printItems();
        }
    }
}
