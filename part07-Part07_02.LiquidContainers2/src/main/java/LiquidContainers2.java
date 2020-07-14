
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            int amount = 0;
            String command = parts[0];
            if (parts.length == 2) {
                amount = Integer.valueOf(parts[1]);
            }
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                int val = first.contains();
                first.remove(amount);
                int actualMoved = val - first.contains();
                second.add(actualMoved);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
