import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check prime number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i < n-1 ; i++ )
        {
            if(n%i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
        sc.close();
    }
}
