
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner textscanner = new Scanner(Paths.get(file))) {
            while (textscanner.hasNextLine()) {
                int num = Integer.parseInt(textscanner.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Numbers: " + count);
    }

}
