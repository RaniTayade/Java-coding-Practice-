package basic;
import java.util.*;
/* input a,b,c
find semeperameter : (a+b+c)/2
area of triangle: area = 1/2 *base*height
here's when we used heron's formula then used Math.sqrt()
 */

public class TriangleArea {
    public static void main(String[] args) {
        int a, b, c, sp, area;
        System.out.println("Enter value of sides of Triangle: ");
        Scanner r=new Scanner(System.in);
        System.out.println("side a : ");
        a=r.nextInt();
        System.out.println("side b : ");
        b=r.nextInt();
        System.out.println("side c : ");
        c=r.nextInt();
         sp=(a+b+c)/2;
         area= (int) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle is "+area);

    }
}
