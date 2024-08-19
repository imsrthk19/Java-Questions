import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        float Celsius = s.nextInt();
        float Fahrenheit = (Celsius * 9/5f) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
