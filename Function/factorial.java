package Function;

import java.util.Scanner;

public class factorial {
    public static int fact(int a)
    {
        int fac = 1;
        for(int i = 1 ; i <= a ; i++)
        {
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a= ");
        int a = sc.nextInt();
        int f = fact(a);
        System.out.println(f);
        sc.close();
    }
}
