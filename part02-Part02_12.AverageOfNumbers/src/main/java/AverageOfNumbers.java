
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
                counter++;
                continue;
            }
        } 
        double avg = 1.0*sum/counter;
        System.out.println("Average of the numbers: " + avg);
    }
}
