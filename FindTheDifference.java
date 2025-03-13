public class FindTheDifference {
    public static void main(String args[])
    {
        String str = "abcd";
        String str2 = "abcde";
        System.out.println(asn(str ,str2));
    }
    public static char asn(String s, String t)
    {
        int len1 = s.length();
        int len2 = t.length();
        int minimum = Math.min(len1,len2);
        StringBuilder build = new StringBuilder(t);
        for(int i = 0; i < minimum; i++)
        {
            if(s.charAt(i) == t.charAt(i))
            {
                build.setCharAt(i , ' ');
            }
        }
        t = build.toString();
        System.out.println("T is = "+ t);
        return 0;
    }
}
