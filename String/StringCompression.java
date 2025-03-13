package String;

public class StringCompression {
    private static String  compress(char[] s)
    {
        String strArray = "";
        for(int i = 0 ; i < s.length ; i++)
        {
            Integer count=1;
            while (i<s.length-1 && s[i] == s[i+1])
            {
                count++;
                i++;
            }
            strArray+=s[i];
            if(count>1)
            {
                strArray+=count.toString();
            }
        }
        return strArray;
    }
    public static void main(String[] args) {
        String s ="aaaabbbcc";
        System.out.println(compress(s.toCharArray()));
    }
}
