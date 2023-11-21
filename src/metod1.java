import java.util.Scanner;

public class metod1 {

    static double circlePerimeter(double perimeter) {
        return 2 * 3.14 * perimeter;
    }

    static void lineDrawer(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
    }

    static void 
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("What is your radius?");
        double radius = Scanner.nextDouble();

        System.out.println("The perimeter of your circle is: " + circlePerimeter(radius));
        lineDrawer(10);
    }


}
