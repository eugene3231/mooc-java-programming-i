
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            String[] words = word.split(" ");
            for (String s : words) {
                if (word.contains("av")) {
                    System.out.println(s);
                } 
            } 
        }

    }
}
