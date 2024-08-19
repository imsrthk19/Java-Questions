import java.util.*;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.print("The year is a leap year");
        }
        else{
            System.out.print("The year is not a leap year");
        }
}
}
