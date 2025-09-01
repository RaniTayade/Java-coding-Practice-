package basic;
/*Calculate Tax on Salary
   input sal <= 10000----no tax
    input sal >10000 b/w  sal<=10000------10%tax
    input sal >100000 -------20%
    */

import java.util.Scanner;

public class TaxOnSalary {
    public static void main(String[] args) {
        int sal;
        double tax;
        System.out.println(" Enter Salary");
        Scanner r= new Scanner(System.in);
        sal=r.nextInt();
        if(sal<=10000)
        {
            System.out.println(sal+" No Tax");
        }else if(sal>10000 && sal<=100000)
        {
            tax=sal*0.10;
            System.out.println(sal+" "+tax);
        }else{
            tax=sal*0.20;
            System.out.println(sal+" "+tax);
        }
    }
}
