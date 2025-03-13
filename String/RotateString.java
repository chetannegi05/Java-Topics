package String;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args)
    {
        String str = "chetannegisingh";
        String goal = "hchetannegising";
        boolean str2 = Rotate(str , goal);
        System.out.println(str2);
    }
    public static boolean Rotate(String str ,String goal)
    {

//        char[] dupChr = new char[str.length()];
//        System.out.println("Enter the range to Rotate");
//        Scanner sc = new Scanner(System.in);
//        int range = sc.nextInt();
//        char[] chr = str.toCharArray();
//        System.out.println(chr);
//        for(int i = 0 ; i < chr.length ; i++)
//        {
//            int j = ((i+range)%(chr.length));
//            dupChr[j] = chr[i];
//        }
//        String ans = new String(dupChr);
//        //System.out.println(dupChr);
//        return ans;
        //sc.close();
        String ans = str + str;
        return ans.contains(goal);
    }
}
