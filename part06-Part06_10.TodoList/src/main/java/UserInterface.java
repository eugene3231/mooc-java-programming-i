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
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("add")){
                System.out.println("To add: ");
                String word = scanner.nextLine();
                this.list.add(word);
            } else if (cmd.equals("list")){
                this.list.print();
            } else if (cmd.equals("remove")){
                System.out.println("Which one is removed? ");
                int xx = Integer.parseInt(scanner.nextLine());
                this.list.remove(xx);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
