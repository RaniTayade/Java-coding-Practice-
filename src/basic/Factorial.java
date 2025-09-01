package basic;
import java.util.Scanner;
//find factorial of no.

public class Factorial {
    public static void main(String[] args) {
        int n; int fact=1;
        System.out.println("Enter any no: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial "+fact);
    }
}
