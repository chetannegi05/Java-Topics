package Function;
import java.util.*;
public class SumOfab {
    public static int Sum(int num1 , int num2) /* parameters or formals parameters */
    {
        int sum = num1 + num2;
        System.out.println(sum);
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a,b); /* arguments or actual parameters */
        sc.close();
    }
}