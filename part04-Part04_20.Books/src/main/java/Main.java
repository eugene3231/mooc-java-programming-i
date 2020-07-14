import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String xx = scanner.nextLine();
            if (xx.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int yy = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            String zz = scanner.nextLine();
            books.add(new Book(xx,yy,zz));
            
        }
        System.out.println("What information will be printed?");
        String command = scanner.nextLine();
        if (command.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            } 
        } else {
            for (Book b : books) {
                System.out.println(b.getName());
            } 
        }
    }
}
