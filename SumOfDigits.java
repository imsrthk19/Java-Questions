import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=s.nextInt();
        int sum=0;
        while(a>0){
            int r=a%10;
            sum=sum+r;
            a=a/10;
        }
        System.out.print("The sum of digits is: " + sum);
    }
}
