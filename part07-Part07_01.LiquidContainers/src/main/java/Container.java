/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Container {
    private String name;
    private int amount;

    public Container(int amount, String name) {
        this.name = name;
        this.amount = amount;
    }
    
    public int removeAmount(int value) {
        if (this.amount >= value) {
            //int newAmount = this.amount - value;
            this.amount -= value;
            return value;
        } else {
            int val = this.amount;
            this.amount = 0;
            return val;
        }
    }
    
    public void addAmount(int value) {
        if (value < 0) {
            return;
        } 
        this.amount += value;
        if (this.amount > 100) {
            this.amount = 100;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.amount + "/100"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
