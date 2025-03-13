package ClassWork;

import java.util.Scanner;

public class CountDiv {
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        while (num>0)
        {
            int lastDigit = num%10;
            if(temp%lastDigit == 0)
            {
                count++;
            }
            num = num/10;
        }
        System.out.println(count
        );
        sc.close();
    }
}
