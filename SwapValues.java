import java.util.*;
public class SwapValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.print("After swapping, first number is " + n1 + " and second number is " + n2);
    }
}
