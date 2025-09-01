package basic;
import java.util.Scanner;

public class PowerofNo {
    public static void main(String[] args) {
        int n; int p; int result=1;
        System.out.println("Enter No.");
        System.out.println("Enter Power");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        p=r.nextInt();
       for (int i=1; i<=p; i++){
           result =result *n;

       }
        System.out.println("Power : "+result);
    }
}
