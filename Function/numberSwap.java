package Function;
import java.util.*;
public class numberSwap {
    public static void swap(int num1 , int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("Value Of a :");
        System.out.println(num1);
        System.out.print("Value Of b :");
        System.out.println(num2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a , b);
        sc.close();
    }
}