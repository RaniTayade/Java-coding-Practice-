package basic;
import java.util.Scanner;
//Cont no. of digits

public class Countdigits {
    public static void main(String[] args) {
        int n; int count=0;
        System.out.println("Enter any no: " );
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while (n>0)
        {
           n=n/10;
           count++;
        }
        System.out.println("No.of Digits"+count);
    }
}
