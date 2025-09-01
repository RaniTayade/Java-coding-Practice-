package basic;
import java.util.Scanner;
//Take character input from user print char
public class PrintChar {
    public static void main(String[] args) {
        System.out.println("Enter your character");
        char ch;
        Scanner r=new Scanner (System.in);
        ch=r.next().charAt(0);
        System.out.println(ch);

    }
}
