package Normalproject;

import java.util.Scanner;

public class shiftTheChar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = "Chetan";
        char[] chrArray = s.toCharArray();
        char[] newArray = new char[chrArray.length];
        System.out.println("Enter the Shift key");
        int k = sc.nextInt();
        for(int i = 0 ; i < chrArray.length ; i++)
        {
            if(k+i < chrArray.length)
            {
                newArray[k+i] = chrArray[i];
            }
            else
            {
                int newIndex = (i+k)%(chrArray.length);
                newArray[newIndex] = chrArray[i];
            }
        }
        String shiftedString = new String(newArray);
        System.out.println("Shiftfed String is "+ shiftedString);
    }
}
