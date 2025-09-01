package basic;
import java.util.Scanner;
//program to find total and average marks of 5 subjects

public class AverageMarks {
    public static void main(String[] args) {
        int a; int b; int c; int d; int e;
        System.out.println("Enter marks of five subjects ");
        Scanner r=new Scanner (System.in);
        a =r.nextInt();
        b =r.nextInt();
        c =r.nextInt();
        d =r.nextInt();
        e =r.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("Total marks"+sum);
        double avg= sum/5.0;
        System.out.println("Average Marks"+avg);
    }
}
