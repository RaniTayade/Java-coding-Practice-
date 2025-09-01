package basic;
import java.util.*;

//Print first n natural numbers
public class PrintFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your term");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
         for (int i=1; i<=n; i++){
        System.out.println( i+" ");
        }
    }
}
