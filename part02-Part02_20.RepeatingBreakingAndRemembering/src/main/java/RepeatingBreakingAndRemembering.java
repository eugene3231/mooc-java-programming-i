
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int counter = 0;
        int sum = 0;
        int evenNo = 0;
        int oddNo = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            } else {
                if (number%2 == 0) {
                    evenNo++;
                } else {
                    oddNo++;
                }
                counter++;
                sum += number;
            }
        }
        double avg = 1.0*sum/counter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenNo);
        System.out.println("Odd: " + oddNo);
        
    }
}
