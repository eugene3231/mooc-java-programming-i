
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int num = scanner.nextInt();
            if (num == 9999) {
                break;
            }
            list.add(num);
        }
        int smallest = Collections.min(list);
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
