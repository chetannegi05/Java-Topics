package Normalproject;

public class reverseString {
    public static void main(String args[])
    {
        String[] a = {"C" , "h" , "e" , "t" , "a" , "n"};
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = i+1 ; j < a.length ;j++)
            {
                String temp = a[i];
                a[i] = a[j];
                a[j]= temp;
            }
        } 
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        } 
    }
}
