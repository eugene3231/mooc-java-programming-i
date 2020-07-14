
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        while (end<=100) {
            System.out.println(end);
            end++;
        } 
    }
}
