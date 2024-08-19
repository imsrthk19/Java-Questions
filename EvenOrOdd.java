import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = s.nextInt();
        if (Num%2==0){
            System.out.println("Even.");
        } 
        else if (Num%2!=0){
            System.out.print("Odd.");
            }
    }   
}
