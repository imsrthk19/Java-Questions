import java.util.*;
public class SimpleInterest{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float Principal = s.nextFloat();
        System.out.print("Enter rate of interest: ");
        int Rate = s.nextInt();
        System.out.print("Enter time (years): ");
        int Time = s.nextInt();
        float SI = (Principal*Rate*Time)/100;
        System.out.print(SI);
    }
}
