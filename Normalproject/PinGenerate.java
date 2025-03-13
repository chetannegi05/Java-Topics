package Normalproject;

import java.util.Scanner;

public class PinGenerate {
    public static void main(String[] args) {
        int password=0,i=0,pow=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to generate the new pin for your Safety");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        while (a!=0)
        {
            int rem1 = a%10;
            int rem2 = b%10;
            int rem3 = c%10;
            int min = Math.min(Math.min(rem1,rem2),rem3);
            max = Math.max(max,Math.max(rem1,Math.max(rem2,rem3)));
            pow = (int)Math.pow(10,i);
            password = (pow*min+password);
            a/=10;
            b/=10;
            c/=10;
            i++;
        }
        pow = (int)Math.pow(10,i);
        System.out.println(i);
        password = (pow*max+password);
        System.out.println(password);
    }
}
