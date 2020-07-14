
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        // Get filename from userinput
        String filename = ui.readFileName();
        // Reads from filename
        RecipeReader newReader = new RecipeReader(filename);
        // Links the listOfRecipes read to the userinterface
        ui.assignListOfRecipes(newReader.getRecipes());
        // Runs the userinterface to ask for commands
        ui.run();
    }

}
