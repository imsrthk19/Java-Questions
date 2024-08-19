import java.util.*;
public class RemainderCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = s.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = s.nextInt();
        int remainder = dividend % divisor;
        System.out.print("The remainder is " + remainder);
}
}
