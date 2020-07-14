
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxString = "";
        int maxlength = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts[0].length() > maxlength) {
                maxString = parts[0];
                maxlength = parts[0].length();
            }
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        }

        if (count > 0) {
            System.out.println("Longest name: " + maxString);
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        } 
    }
}
