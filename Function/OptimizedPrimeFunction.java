package Function;

public class OptimizedPrimeFunction {
    public static boolean prime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i = 2 ; i<=Math.sqrt(num) ; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int num = 4;
        //System.out.println(prime(97));
        if (prime(num)) {
            System.out.println(num + " is prime");
        }    
        else {
            System.out.println(num + " is not prime");
        }
    }
}
