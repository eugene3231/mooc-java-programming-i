
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) { // if the sum is over 100
            System.out.println(num*-1);
        } else { // if the sum is less than 0
            System.out.println(num);
        }
    }
}
