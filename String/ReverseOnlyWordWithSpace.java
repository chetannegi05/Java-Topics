package String;

public class ReverseOnlyWordWithSpace {
    public static void main(String[] args) {
        String a = "         Chetan Negi From        Haridwar       ";
        String[] strArry  = a.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = strArry.length-1; i >= 0 ; i--)
        {
            ans.append(strArry[i]);
            if(i!=0)
            {
                ans.append(" ");
            }
        }
        System.out.println(ans.toString());
    }
}
