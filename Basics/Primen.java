import java.util.*;
public class Primen {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Check it is prime or not");
        int a = sc.nextInt();
        boolean temp = true;
        for(int i = 2 ; i < a-1 ; i++)
        {
            if(a%i == 0)
            {
                temp = false;
            }
        }
            if(temp == false)
            {
                System.out.println("It is not an Prime Number");
            }
            else
            {
                System.out.println("It is an Prime Number");
            }
        sc.close();
    }
}
