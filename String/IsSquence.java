package String;

public class IsSquence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "avdbkmnlcw";
        boolean ans = isSquence(s,t);
        System.out.println(ans);
    }
    private static boolean isSquence(String s , String t)
    {
        int sI = 0;
        int tI = 0;
        while(sI<s.length() && tI<t.length())
        {
            if(s.charAt(sI) == t.charAt(tI))
            {
                sI++;
            }
            tI++;
        }
        if(sI == s.length())
        {
            return true;
        }
        return false;
    }
}
