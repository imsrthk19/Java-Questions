import java.util.*;
public class DaysInWeeks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of weeks: ");
        int weeks = s.nextInt();
        int days = weeks * 7;
        System.out.print("The number of days is: " + days);
    }
}
