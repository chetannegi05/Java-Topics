package Recursion;

public class NumberIntoString {
    static String digit[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void printDigit(int number)
    {
        if(number == 0)
        {
            return;
        }
        int lastDigit = number % 10;
        number = number / 10;
        printDigit(number);
        System.out.print(digit[lastDigit]);
    }
    public static void main(String[] args) {
        int num = 1234;
        printDigit(num);
        System.out.print("");
    }
}
