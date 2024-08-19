import java.util.*;
public class BMICalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        float weight = s.nextFloat();
        System.out.print("Enter height in meters: ");
        float height = s.nextFloat();
        float BMI = weight/(height*height);
        System.out.print("The BMI is " + BMI);
    }
}
