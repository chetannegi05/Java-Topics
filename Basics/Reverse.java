public class Reverse {
    public static void main(String args[])
    {
        int n = 1234;
        int sum = 0;
        while(n>0)
        {
            sum = n % 10;
            System.out.print(sum);
            n = n/10;
        };
    }
}
