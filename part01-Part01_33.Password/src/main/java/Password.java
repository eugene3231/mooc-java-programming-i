
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String first = scan.nextLine();

        if (!first.equals("Caput Draconis")) {
            System.out.println("Off with you!");
        } else {
            System.out.println("Welcome!");
        }

        // Write your program here 
    }
}
