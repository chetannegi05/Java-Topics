import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is Prime or Not");
//        int number = sc.nextInt();
        int number = 2;
        int count = 0;
        if(number <= 1 )
        {
            System.out.println("Not a prime number");
        }
        else
        {
            for(int i = 2 ; i < number-1 ; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count != 0)
            {
                System.out.println("Not Prime number");
            }
            else
            {
                System.out.println(" prime number");
            }
        }
    }
}
