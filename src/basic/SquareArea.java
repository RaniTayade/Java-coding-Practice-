package basic;
import java.util.*;
//area =a*a

public class SquareArea {
    public static void main(String[] args) {
        int side, area;
        System.out.println("Enter side of Square: ");
        Scanner r=new Scanner (System.in);
        side=r.nextInt();
        area=side*side;
        System.out.println("Area of Square: "+area);
    }
}
