/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class UserInterface {
    private Scanner sc;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner sc) {
        this.sc = sc;
        this.birdList = new ArrayList<>();
    }
    
    public void run() {
        while (true) {
            System.out.print("? ");
            String cmd = this.sc.nextLine();
            if (cmd.equals("Add")) {
                addCmd();
            } else if (cmd.equals("Observation")) {
                obsCmd();
            } else if (cmd.equals("All")) {
                allCmd();
            } else if (cmd.equals("One")) {
                oneCmd();
            } else if (cmd.equals("Quit")) {
                break;
            }
        }
    }
    
    public void addCmd() {
        System.out.print("Name: ");
        String name = this.sc.nextLine();
        System.out.print("Name in Latin: ");
        String nameLatin = this.sc.nextLine();
        Bird newBird = new Bird(name, nameLatin);
        birdList.add(newBird);
    }
    
    public void obsCmd() {
        System.out.print("Bird? ");
        String obsBirdName = sc.nextLine();

        boolean isABird = false;
        for (Bird b : birdList) {
            if (b.getName().equals(obsBirdName)) {
                isABird = true;
                b.observed();
            }
        }
        if (!isABird) {
            System.out.println("Not a bird!");
            return;
        }         
    }
    
    public void allCmd() {
        for (Bird b : birdList) {
            System.out.println(b);
        }
    }
    
    public void oneCmd() {
        System.out.print("Bird? ");
        String obsBirdName = sc.nextLine();
        boolean isABird = false;
        for (Bird b : birdList) {
            if (b.getName().equals(obsBirdName)) {
                isABird = true;
                System.out.println(b);
            }
        }
        if (!isABird) {
            System.out.println("Not a bird!");
            return;
        }
    }
}
