package SimplePractices;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nInvoice");
        System.out.println("You bought " + quantity + " " + item +"/s");
        System.out.println("Total " + currency + total);
        scanner.close();
    }
}
