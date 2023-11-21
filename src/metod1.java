import java.util.Scanner;

public class metod1 {

    static double circlePerimeter(double perimeter) {
        return 2 * 3.14 * perimeter;
    }

    static void lineDrawer(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void rectangleDrawer(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your radius?");
        double radius = scanner.nextDouble();

        System.out.println("The perimeter of your circle is: " + circlePerimeter(radius));
        lineDrawer(10);
        scanner.nextLine();

        // create a rectangle
        System.out.println("Create a rectangle ");
        rectangleDrawer(3, 3);
    }
}
