package Function;
public class DecimalToBinary {
    public static int converter(int num)
    {
        int pow = 0;
        int bin = 0;
        while (num>0) {
            int rem = num%2;
            bin = bin + rem * (int)(Math.pow(10, pow));

            pow++;
            num = num/2;
        }
        return bin;
    }
    public static void main(String args[])
    {
        int a = converter(10);
        System.out.println(a);
    }
}
