
public class AdvancedAstrology {

    public static void printStars(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.print("*");
            counter ++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while(size > 0) {
            printSpaces(size-1);
            printStars(counter);
            size--;
            counter++;
        }
    }

    public static void christmasTree(int height) {
        int actualheight = height;
        int counter = 1;
        while (height > 0) {
            printSpaces(height-1);
            printStars(counter);
            height--;
            counter = counter + 2;
        }
        printSpaces(actualheight-2);
        printStars(3);
        printSpaces(actualheight-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printTriangle(5);
        //System.out.println("---");
        christmasTree(10);
        //System.out.println("---");
        //christmasTree(10);
    }
}
