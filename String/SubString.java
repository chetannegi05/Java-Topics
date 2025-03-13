package String;

public class SubString {
    private static String sub(int si , int ei , String s)
    {
        String subs = "";
        for(int i = si ; i < ei ; i++)
        {
            subs+=s.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        String s ="Hello World";
        System.out.println(sub(0,5,s));
    }
}
