class CalculateDiscountedFee {
    public static void main(String[] args) {
        // Declare variables
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount and discounted fee
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is: " + discount + " and final discounted fee is: " + discountedFee);
    }
}