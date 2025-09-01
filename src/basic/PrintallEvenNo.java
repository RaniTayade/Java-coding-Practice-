package basic;
import java.util.Scanner;
//Print all Even Numbers Between 0 to N
public class PrintallEvenNo {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no of term ");
        Scanner r=new Scanner (System.in);
        n=r.nextInt();
        for(int i=0; i<=n; i=i+2){
            System.out.println(i);
        }
    }
}
