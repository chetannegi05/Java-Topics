package Sorting;

public class SelectionSort {
    public static void select(int arry[])
    {
        for(int i = 0 ; i < arry.length - 1 ; i++)
        {
            int minValueIndex = i;
            for(int j = i+1 ; j < arry.length - 1 ; j++)
            {
                if(arry[minValueIndex] > arry[j])
                {
                    minValueIndex = j;
                }
            }
            int temp = arry[i];
            arry[i] = arry[minValueIndex];
            arry[minValueIndex] = temp;
        }
        for(int i = 0 ; i < arry.length-1 ; i++)
        {
            System.out.print(arry[i] + " ");
        } 
    }
    public static void main(String args[])
    {
        int arry[] = {3,2,5,1,7,8};
        select(arry);
    }
}