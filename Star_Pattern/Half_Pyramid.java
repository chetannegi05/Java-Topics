package Star_Pattern;

public class Half_Pyramid {
    public static void pattern(int r , int c)
    {
        for(int i = 0 ; i<r ; i++)
        {
            for(int j = 0 ; j<c ; j++)
            {
                if(i+j < c)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        pattern(4, 4);
    }
}
