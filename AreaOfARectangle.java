import java.util.*;
public class AreaOfARectangle {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = s.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = s.nextInt();
        int Area = length*breadth;
        System.out.print("Area = " + Area);
    }
}
