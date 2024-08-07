//Area of circle:
public class HomeWork {
    public static void main(String[] args) {
        int radius = 5;
        double area = 3.14*radius*radius;
        System.out.println(area);
    }
}
*****************************************************************************
//Simple Interest:
public class HomeWork {
    public static void main(String[] args) {
        int pri = 2100;
        int rate=5;
        int time=2;
        int si = (pri*rate*time)/100;
        System.out.println(si);
    }
}
*******************************************************************************
//Even or Odd Number:
public class HomeWork {
    public static void main(String[] args) {
        int n=6;
        if (n%2==0) {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    }
*******************************************************************************
//Temperature Conversion from celsius to Fahrenheit:
public class HomeWork {
    public static void main(String[] args) {
        int celsius=0;
        int conversion = (celsius*(9/5))+32;
        System.out.println(conversion);
    }
*****************************************************************************
//Find greatest among three numbers:
public class HomeWork {
    public static void main(String[] args) {
    int a=2;
    int b=9;
    int c=8;
    if(a>b){
        if(a>c){
            System.out.println("a is greatest");
    }
    else if(b>c){
        if(b>a){
        System.out.println("b is greatest");
    }
}
    else if (c>a){
        if (c>b){
            System.out.println("c is greatest");
        } 
    }
}
}
}
**********************************************************************************
//Calculating grades:
public class HomeWork {
    public static void main(String[] args) {
        int marks =80;
        if (marks >90){
            System.out.println("A");
        }
        else if(marks < 90 && marks > 80){
                System.out.println("B");
            }
        else if(marks < 80 && marks > 70){
            System.out.println("C");
        else if(marks < 70 && marks > 60){
            System.out.println("D");
        else if(marks < 60 && marks > 50){
            System.out.println("E");
        else{
            System.out.println("Fail");
            }
        }
    }
