
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String ss = scanner.nextLine();
            if (ss.equals("end")) {
                break;
            } else {
                int ii = Integer.parseInt(ss);
                System.out.println(ii*ii*ii);
            }
        }
    }
}
