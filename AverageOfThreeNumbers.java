import java.util.*;
public class AverageOfThreeNumbers {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();
        float average = (num1+num2+num3)/3;
        System.out.println("The average is "+ average);
    } 
}
