import java.util.*;
public class WindChill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        
        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = sc.nextDouble();
        
        sc.close();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
