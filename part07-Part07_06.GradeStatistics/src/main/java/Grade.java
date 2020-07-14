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
public class Grade {
    private int totalSum;
    private int totalCount;
    private ArrayList<Integer> passingList;
    private int[] gradeList;

    public Grade() {
        this.totalSum = 0;
        this.totalCount = 0;
        this.passingList = new ArrayList<>();
        this.gradeList = new int[6];
    }
    
    public double calcAvg() {
        return 1.0*this.totalSum/this.totalCount;
    }
    
    public void addToTotalSum(int num) {
        if (num >= 50) {
            this.passingList.add(num);
        }
        this.totalSum += num;
        this.totalCount++;
    }
    
    public double calcPassingAvg() {
        int passingSum = 0;
        for (Integer i : this.passingList) {
            passingSum += i;
        }
        return 1.0*passingSum/this.passingList.size();
    }
    
    public double calcPassingPercent() {
        return 1.0*this.passingList.size()/totalCount*100;
    }
    
    public void processGrade(int num) {
        if (num < 0 || num > 100) {
            return;
        }
        if (num < 50) {
            gradeList[0]++;
        } else if (num < 60) {
            gradeList[1]++;
        } else if (num < 70) {
            gradeList[2]++;
        } else if (num < 80) {
            gradeList[3]++;
        } else if (num < 90) {
            gradeList[4]++;
        } else if (num >= 90) {
            gradeList[5]++;
        }
    }

    public int[] getGradeList() {
        return gradeList;
    }
    
    public void printStar() {
        System.out.print("*");
    }
    
    public void printGrades() {
        System.out.println("Grade distribution:");
        for(int i=5; i>=0;i--) {
            System.out.print(i + ": ");
            for(int j=0;j<gradeList[i];j++){
                printStar();
            }
            System.out.println("");
        }
    }
    
}
