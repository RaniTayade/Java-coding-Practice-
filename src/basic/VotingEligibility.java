package basic;
import java.util.Scanner;

public class VotingEligibility {
public static void main(String[] args) {
    System.out.println("Enter your Age: ");
    int age;
    Scanner r= new Scanner(System.in);
    age=r.nextInt();
    if (age>18)
    {
        System.out.println("Eligible for vote");
    }else{
        System.out.println("Not Eligible For Vote");
    }
  }
}

