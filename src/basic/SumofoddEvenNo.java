package basic;
import java.util.Scanner;

public class SumofoddEvenNo {
    public static void main(String[] args) {
        System.out.println(" Enter range");
        int n; int i; int sum=0;
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
            for( i=0; i<=n; i= i+2) {
                sum = sum + i;
            }
             System.out.println("Sum of even no "+sum);
        }else{
            for (i=1; i<=n; i=i+2){
                sum=sum+i;
            }
            System.out.println("sum of Odd "+sum);
        }
    }
}
