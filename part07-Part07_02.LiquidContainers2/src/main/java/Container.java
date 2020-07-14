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

    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void remove(int value) {
        if (value < 0) {
            return;
        }
        if (this.amount >= value) {
            //int newAmount = this.amount - value;
            this.amount -= value;
        } else {
            int val = this.amount;
            this.amount = 0;
        }
    }
    
    public void add(int value) {
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
        return this.amount + "/100"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
