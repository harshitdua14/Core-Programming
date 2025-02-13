package Level2;
import java.util.Scanner;
class CalculateTriangleArea {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculate area
        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCm = areaInSquareInches * 6.4516; // 1 square inch = 6.4516 square cm

        // Display the result
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");
    }
}
