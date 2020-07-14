
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String m : meals) {
            System.out.println(m);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
    // implement the required methods here
}
