import java.util.Scanner;

class CalculateDiscountedFeeUserInput {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and discounted fee
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is: " + discount + " and final discounted fee is: " + discountedFee);
        
    }
}