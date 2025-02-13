class ConvertDistance {
    public static void main(String[] args) {
        // Declare variables
        double distanceInKm = 10.8;
        double kmToMiles = 1.6;

        // Convert distance to miles
        double distanceInMiles = distanceInKm / kmToMiles;

        // Display the result
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
