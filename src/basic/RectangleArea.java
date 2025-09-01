package basic;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
// input l  input b   formula l*b

public class RectangleArea {
    public static void main(String[] args) {
        int l; int b; int area;
        System.out.println("Enter value for sides");
        System.out.println("Enter l");
        Scanner r=new Scanner (System.in);
        l=r.nextInt();
        System.out.println("Enter b");
        b=r.nextInt();
        area=l*b;
        System.out.println("Area of Rectangle :"+area);
    }
}
