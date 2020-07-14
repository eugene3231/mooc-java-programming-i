
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author User
 */
public class RecipeReader {
    private ArrayList<Recipe> recipes;
    private Scanner sc;
    
    public RecipeReader(String zxc) {
        this.recipes = new ArrayList<>();
        try (Scanner gg = new Scanner(Paths.get(zxc))) {
            this.sc = gg;
            readRecipesFromFile();
        } catch (Exception e) {
            System.out.println("cannot read file:" + e);
        }
    }
    
    public void readRecipesFromFile() {
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            int time = Integer.parseInt(sc.nextLine());
            Recipe newRecipe = new Recipe(name,time);
            this.recipes.add(newRecipe);
            while (sc.hasNextLine()) {
                String ingred = sc.nextLine();
                if (ingred.equals("")) {
                    break;
                }
                newRecipe.getIngred().add(ingred);
            }
        }
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
    
}
