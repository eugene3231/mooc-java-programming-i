import java.util.Scanner;
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
public class UserInterface {
    private Scanner sc;
    private ArrayList<Recipe> listOfRecipes;

    public UserInterface(Scanner sc) {
        this.sc = sc;
    }
    
    public String readFileName() {
        System.out.print("File to read: ");
        String filename = this.sc.nextLine();
        System.out.println("");
        return filename;
    }
    
    public void assignListOfRecipes(ArrayList<Recipe> recipes) {
        this.listOfRecipes = recipes;
    }
    
    public void run() {
        System.out.println("Commands:\n" + "list - lists the recipes\n" 
                + "stop - stops the program\n" + "find name - searches recipes by name\n" 
                + "find cooking time - searches recipes by cooking time\n" 
                + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = sc.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : listOfRecipes) {
                    System.out.println(r);
                }
                System.out.println("");
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = sc.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : listOfRecipes) {
                    if (r.getName().contains(word)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(sc.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : listOfRecipes) {
                    if (r.getCookingTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = sc.nextLine();
                System.out.println("");
                for (Recipe r : listOfRecipes) {
                    if (r.getIngred().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }    
    }
}
