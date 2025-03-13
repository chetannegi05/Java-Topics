package String;

public class CalculateCharacter {
    public static void main(String args[])
    {
        String str = "ChetanNegi";
        char[] chrarry = str.toCharArray();
        calchar(chrarry);
    }
    public static void calchar(char[] chrarry)
    {
        int count = 0;
        for (int i = 0; i <= chrarry.length - 1; i++) {
            for (int j = 0; j <= chrarry.length - 1 ; j++) {
                if(chrarry[i] == chrarry[j])
                {
                    count++;
                }
            }
            System.out.println(chrarry[i]+"=" + count);
            count  = 0;
        }
    }
}
