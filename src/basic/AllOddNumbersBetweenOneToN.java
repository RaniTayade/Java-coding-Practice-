package basic;
import java.util.Scanner;
public class AllOddNumbersBetweenOneToN {
    public static void main(String[] args) {
        System.out.println("Enter n :");
        Scanner r = new Scanner(System.in);
        int i;
        int n = r.nextInt();
        System.out.println("odd no between 1 and " + n + " ");
        for (i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }

    }
}

