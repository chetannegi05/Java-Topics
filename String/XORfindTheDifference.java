package String;

public class XORfindTheDifference {
    public static void main(String args[])
    {
        String str1 = "abcd";
        String str2 = "abicd";
        System.out.println(difference( str1, str2));
    }
    public static char difference(String s, String t)
    {
        char ans  = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            ans ^= s.charAt(i);
        }
        for(int i  = 0 ; i < t.length() ; i++)
        {
            ans ^= t.charAt(i);
        }
        return ans;
    }
}
