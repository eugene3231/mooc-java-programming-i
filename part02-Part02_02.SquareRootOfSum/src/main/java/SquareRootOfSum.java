
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        double squareRoot = Math.sqrt(first+second);
        System.out.println(squareRoot);
    }
}
