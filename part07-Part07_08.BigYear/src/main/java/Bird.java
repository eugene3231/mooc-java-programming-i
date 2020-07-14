/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int count;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.count = 0;
    }

    public String getName() {
        return name;
    }
 
    public void observed() {
        this.count++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.count + " observations"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
