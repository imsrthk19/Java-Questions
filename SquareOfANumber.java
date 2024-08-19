import java.util.*;
public class SquareOfANumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int square = num*num;
        System.out.print("The square of the number is " + square);
    }
}
