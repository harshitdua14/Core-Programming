class ComputeEarthVolume {
    public static void main(String[] args) {
        // Declare variables
        double radiusInKm = 6378;
        double kmToMiles = 0.621371;

        // Calculate volume in cubic kilometers
        double volumeInKm3 = (4/3) * 3.14 * Math.pow(radiusInKm, 3);

        // Convert volume to cubic miles
        double volumeInMiles3 = volumeInKm3 * Math.pow(kmToMiles, 3);

        // Display the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 + " and cubic miles is " + volumeInMiles3);
    }
}