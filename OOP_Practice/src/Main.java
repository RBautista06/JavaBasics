import java.util.Scanner;

public class Main {
    public static  void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // use this to prevent the bug for scanning the next input

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.println("Your age is: " + age);
        System.out.println("Your name is: " + name);
        scanner.close();
    }

}
