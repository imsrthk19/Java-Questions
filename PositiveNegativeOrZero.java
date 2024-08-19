import java.util.*;
public class PositiveNegativeOrZero {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = s.nextInt();
        if (Num>0){
            System.out.println("Positive.");
        }
        else if (Num==0){
            System.out.println("Zero.");
        }
        else if (Num<0) {
            System.out.println("Negative.");
        }
    }
}
