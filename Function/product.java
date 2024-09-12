package Function;

public class product {
    public static int multiply(int a , int b)
    {
        int product = a*b;
        return product;
    }
    public static void main(String args[])
    {
        int a = 2;
        int b = 3;
        int pro = multiply(a,b);
        System.out.println(pro);
    }
}
