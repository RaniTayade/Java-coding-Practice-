package basic;
import java.util.Scanner;
public class SumoffirstNnaturalno {
    public static void main(String[] args) {
        System.out.println("Enter no.of term");
        int n=0;
        int sum=0;
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        for (int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Addition : "+sum);
    }
}
