package Function;
import java.util.*;

public class swapNumber {
      public static void reverse(int num1 , int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
        System.out.print("value of temp:");
        System.out.print(temp);
    }    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        reverse(a, b);
        sc.close();
    }
}
