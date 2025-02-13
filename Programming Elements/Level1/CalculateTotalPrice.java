import java.util.Scanner;

class CalculateTotalPrice {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is:" + totalPrice + " if the quantity is: " + quantity + " and unit price is: " + unitPrice);
    }
}