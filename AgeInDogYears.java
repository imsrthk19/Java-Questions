import java.util.*;
public class AgeInDogYears {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int Age = sc.nextInt();
        int DogAge = Age*7;
        System.out.print(DogAge);
    } 
}
