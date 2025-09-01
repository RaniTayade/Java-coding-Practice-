package basic;
import java.util.Scanner;
//a=10 b=20 after swapping a=20 b=10

public class SwapNoWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter any two numbers ");
        Scanner r= new Scanner (System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before Swapping "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+a+" "+b);

    }
}
