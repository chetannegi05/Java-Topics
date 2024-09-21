package String;

public class Palindrome {
    public static void main(String args[])
    {
        String str = "Marge, let's \\\"[went].\\\" I await {news} telegram0";
        palindrome(str);
    }
    public static void palindrome(String str)
    {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();;
        System.out.println(str);
        char newStr[] = str.toCharArray();
        int j = newStr.length-1;
        for(int i = 0 ; i < j ; i++)
        {
            char temp = newStr[i];
            newStr[i] = newStr[j];
            newStr[j] = temp;
            j--;
        }
        String comapString = new String(newStr);
        if (str.equals(comapString)) {
            System.out.println("It is an Palindrome String");
        }
        else{
            System.out.println("It is not an Palindorme String");
        }
    }
}
