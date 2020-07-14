/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String trans = scanner.nextLine();
                this.dict.add(word, trans);
            } else if (cmd.equals("search")){
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String xx = this.dict.translate(toBeTranslated);
                if (xx == null ) {
                    System.out.println("Word "+ toBeTranslated +" was not found");
                } else {
                    System.out.println("Translation: " + xx);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
