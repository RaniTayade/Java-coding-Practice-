package basic;
import java.util.Scanner;
/*Convert Char Uppercase to Lowercase and vice versa
input a to z----->Uppercase
input A to Z----->Lowercase
 */

public class ConvertUppercase {
    public static void main(String[] args) {
        char ch, ch2;
        System.out.println("Enter any Character ");
        Scanner r=new Scanner (System.in);
        ch=r.next().charAt(0);
        if (ch>='A' && ch<='Z')
        {
            ch2 =Character.toLowerCase(ch);
            System.out.println("Lowercase "+ch2);
        }
        else
        {
            ch2=Character.toUpperCase(ch);
            System.out.println("Uppercase "+ch2);
        }
    }
}
