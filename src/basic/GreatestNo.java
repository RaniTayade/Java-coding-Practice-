package basic;
import java.util.Scanner;
//Maximum no between two no.

public class GreatestNo {
    public static void main(String[] args) {
        int a; int b;
        System.out.println("Enter Two Numbers");
        Scanner r=new Scanner (System.in);
        a=r.nextInt();
        b=r.nextInt();
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}
