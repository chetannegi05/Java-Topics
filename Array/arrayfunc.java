public class arrayfunc {
    public static void update(int arry[] ,int n)
    {
        n = 56;
        for(int i = 0 ; i < arry.length ; i++)
        {
            arry[i] = arry[i] + 1;
        }
    }
    public static void main(String args[])
    {
        int arry[] = {90, 99, 89};
        int non_changable = 45;
        update(arry , non_changable);
        {
            for(int i = 0 ; i < arry.length ; i++)
            {
                System.out.print(   arry[i]+ " " );
            }
            System.out.println();
            System.out.println(non_changable);
        }
    }
}
