
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    public static void divisibleByThreeInRange(int start, int end) { 
        /* Add 1 explicitly as A is divisible by M 
        if (start % 3 == 0) {
            System.out.println((end / 3) - (start / 3) + 1); ; 
        } else {
        // A is not divisible by M 
            System.out.println((end / 3) - (start / 3)); 
        }
        */
        for (int i = start; i<=end; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    } 
}
