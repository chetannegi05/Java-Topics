import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverse = 0;
        int temp = number;
        while(temp > 0)
        {
            int reminder = temp%10;
            reverse = reverse *10 + reminder;
            temp = temp/10;
        }
        if(reverse == number)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not ");
        }
    }
}
