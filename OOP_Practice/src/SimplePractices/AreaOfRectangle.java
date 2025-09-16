package SimplePractices;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Area of Rectangle Calculation");

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The Area of Rectangle is: " + area  + "cm");

        scanner.close(); // always close the scanner
    }

}
