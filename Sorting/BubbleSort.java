package Sorting;

public class BubbleSort {
    public static void sorting(int arry[])
    {
        for(int i = 0 ; i < arry.length-1 ; i++)
        {
            for ( int j = 0 ; j < arry.length-1-i ; j++)
            {
                if(arry[j] > arry[j+1])
                {
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < arry.length ; i++)
        {
            System.out.print(arry[i] + "    ");
        }
    }
    public static void main(String args[])
    {
        int arry[] = {5,2,3,1,4};
        sorting(arry);
    }
}
