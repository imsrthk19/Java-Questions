import java.util.*;
public class PerimeterOfASquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int side = s.nextInt();
        int perimeter = 4 * side;
        System.out.print("The perimeter of the square is: " + perimeter); 
    }
}
