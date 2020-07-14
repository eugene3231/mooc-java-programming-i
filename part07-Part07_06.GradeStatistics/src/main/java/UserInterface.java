/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class UserInterface {
    private Scanner sc;

    public UserInterface(Scanner sc) {
        this.sc = sc;
    }
    
    public void run() {
        System.out.println("Enter point totals, -1 stops:");

        Grade grade = new Grade();
        receiveInput(grade);
        
        double avg = grade.calcAvg();
        System.out.println("Point average (all): " + avg);
        
        double passingAvg = grade.calcPassingAvg();
        System.out.println("Point average (passing): " + passingAvg);
        
        double passingPercent = grade.calcPassingPercent();
        System.out.println("Pass percentage: " + passingPercent);
        
        grade.printGrades();
    }
    
    public void receiveInput(Grade grade) {
        while (true) {
            int num = Integer.parseInt(this.sc.nextLine());
            if (num == -1) {
                break;
            } else if (num < 0 || num > 100) {
                continue;
            } else {
                grade.addToTotalSum(num);
                grade.processGrade(num);
            }
        }
    }
}
