
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int score = scan.nextInt();
        if (score > 100) {
            System.out.println("Grade: " + "incredible!");
        } else if (score > 89) {
            System.out.println("Grade: " + 5 );
        } else if (score > 79) {
            System.out.println("Grade: " + 4 );
        } else if (score > 69) {
            System.out.println("Grade: " + 3 );
        } else if (score > 59) {
            System.out.println("Grade: " + 2 );
        } else if (score > 49) {
            System.out.println("Grade: " + 1 );
        } else if (score > -1) {
            System.out.println("Grade: " + "failed" );
        } else {
            System.out.println("Grade: " + "impossible!" );
        }
    }
}
