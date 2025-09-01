package basic;
import java.util.Scanner;
//A of circle= PI*r*r , PI=22/7 or 3.14

public class CircleArea {
    public static void main(String[] args) {
        final double PI=3.14, area;
        int r;
        System.out.println("Enter radius of circle: ");
        Scanner ref=new Scanner(System.in);
        r=ref.nextInt();
        area=PI*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
