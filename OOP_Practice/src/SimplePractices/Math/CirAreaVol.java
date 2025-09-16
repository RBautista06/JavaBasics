package SimplePractices.Math;
import java.util.Scanner;

public class CirAreaVol {
    public static void main( String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius  = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("Circumference: %.2fcm \n", circumference);
        System.out.printf("Area: %.2fcm \n", area);
        System.out.printf("Volume: %.2fcm\n", volume);

        scanner.close();
    }
}
