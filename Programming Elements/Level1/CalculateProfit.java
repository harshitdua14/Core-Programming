class CalculateProfit {
    public static void main(String[] args) {
        // Declare variables
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Display the result
        System.out.println("The Cost Price is: " + costPrice + " and Selling Price is: " + sellingPrice + "\n" +
                           "The Profit is: " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}