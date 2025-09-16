package SimplePractices.Math;
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
//      hypotenuse = c = math.sqrt(a2 + b2)
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hypotenuse Calculator");
        double a;
        double b;
        double c;
        System.out.print("Enter the length of Side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of Side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse is " + c);
        scanner.close();


    }
}
