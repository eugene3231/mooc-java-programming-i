
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container(0, "First");
        Container second = new Container(0, "Second");

        while (true) {
            System.out.println(first);
            System.out.println(second);

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
                first.addAmount(amount);
            } else if (command.equals("move")) {
                int val = first.removeAmount(amount);
                second.addAmount(val);
            } else if (command.equals("remove")) {
                second.removeAmount(amount);
            }

        }
    }

}
