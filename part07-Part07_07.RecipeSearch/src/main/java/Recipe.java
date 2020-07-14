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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingred;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingred = new ArrayList<>();
    }
    
    public void addIngred(String xx) {
        this.ingred.add(xx);
    }

    public ArrayList<String> getIngred() {
        return this.ingred;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
