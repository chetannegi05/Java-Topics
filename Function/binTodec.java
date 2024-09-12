package Function;

public class binTodec {
    public static void converter(int num)
    {
        int pow = 0;
        int dec_number = 0;
        while(num>0)
        {
            int last_digit = num%10;
            dec_number = dec_number + (last_digit * (int)Math.pow(2,pow));
            pow++;
            num = num/10;
        }
        System.out.println("Decimal of "+ num +" is "+ dec_number);
    }
    public static void main(String args[])
    {
        converter(101);
    }
}
