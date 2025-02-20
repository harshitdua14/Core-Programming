import java.util.*;
class AtheleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first side of the triangular park (meters): ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter the second side of the triangular park (meters): ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter the third side of the triangular park (meters): ");
        double side3 = sc.nextDouble();
        
        sc.close();
        
        double perimeter = side1 + side2 + side3;
        int rounds = calculateRounds(perimeter);
        
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
    
    public static int calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return (int) Math.ceil(distanceToRun / perimeter);
    }
}
