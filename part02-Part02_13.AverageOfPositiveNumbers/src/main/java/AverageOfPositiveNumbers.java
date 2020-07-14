
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num > 0) {
                    sum += num;
                    counter++;
                }
                continue;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        }
        double avg = 1.0*sum/counter;
        System.out.println("Average of the numbers: " + avg);
    }
}
