import java.util.*;
public class HoursToMinutes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        int hours = s.nextInt();
        int minutes = hours*60;
        System.out.print("The time in minutes is " + minutes);
    }
}
