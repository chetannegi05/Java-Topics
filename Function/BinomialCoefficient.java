package Function;
import java.util.Scanner;

public class BinomialCoefficient {
    public static int fact(int a)
    {
        int f = 1;
        for(int i = 1 ; i <= a ; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static int BioCoe(int n, int r)
    {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int biocoeffi = fact_n/(fact_r * fact_nmr);
        return biocoeffi;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int a = sc.nextInt();
        System.out.println("Enter the value of R");
        int b = sc.nextInt();
        int ans = BioCoe(a, b);
        System.out.println(ans);
        sc.close();
    }
}
