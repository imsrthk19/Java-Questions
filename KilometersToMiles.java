import java.util.*;
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        int Kilometers = s.nextInt();
        float miles = 0.621371f*Kilometers;
        System.out.print(miles); 
    }
    
}
