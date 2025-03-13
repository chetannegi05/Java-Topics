package String;

import java.util.Scanner;

public class ShiftedByReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String str = sc.nextLine();
        char[] chrArray = str.toCharArray();
        System.out.println("Enter the key for shift");
        int k = sc.nextInt();
        int len = str.length();
        int len1 = str.length()-1;
        reverse(0,len1-2,chrArray);
        reverse(len-k,len1,chrArray);
        reverse(0,len1,chrArray);
        String answer = new String(chrArray);
        System.out.println("New String is " + answer);
    }
    private static void reverse(int start, int end , char[] chrArray)
    {
        while (start<end)
        {
            char temp = chrArray[start];
            chrArray[start] = chrArray[end];
            chrArray[end] = temp;
            start++;
            end--;
        }
    }
}
