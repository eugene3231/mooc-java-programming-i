
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.print("*");
            counter ++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
