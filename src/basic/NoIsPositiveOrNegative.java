package basic;
import java.util.Scanner;

public class NoIsPositiveOrNegative {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter your Number ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        if ( a>0)
        {
            System.out.println("Number is Positive ");
        }else if(a<0)
        {
            System.out.println("Number is Negative ");
        }else
        {
            System.out.println("Neither +ve nor -ve ");
        }
    }
}
