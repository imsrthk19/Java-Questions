import java.util.*;
public class TotalSalary {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter hourly wage: ");
        int wage = s.nextInt();
        System.out.print("Enter hours worked: ");
        int hours = s.nextInt();
        int TotalSalary = wage*hours;
        System.out.print(TotalSalary);
    }
}
