package basic;
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        int a; int b;
        System.out.println("Enter your numbers to add them");
        Scanner r =new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        int result= a+b;
        System.out.println("Addition of your no.is : "+result);

    }
}
