import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String xx = scanner.nextLine();
            if (xx.equals("")) {
                break;
            }
            System.out.println("Name: ");
            System.out.println("Duration: ");
            int yy = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(xx,yy));
            
        }
        
        System.out.println("Program's maximum duration?");
        int maxVal = scanner.nextInt();
        System.out.println(maxVal);
        for (TelevisionProgram tv : programs) {
            if (tv.getDuration() <= maxVal) {
                System.out.println(tv);
            }
        }
        
    }
}
