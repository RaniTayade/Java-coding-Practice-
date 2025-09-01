package basic;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your no.");
        Scanner r=new Scanner(System.in);
         n=r.nextInt();
        if (n%2==0) {
            System.out.println("No. is even");
        }else{
            System.out.println("No.is odd");
        }
    }
}

