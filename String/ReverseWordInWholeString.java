package String;

public class ReverseWordInWholeString {
    public static void main(String[] args) {
        String str =  "My Name Is Chetan Negi";
        String[] newStr = str.split(" ");
        String[] updatedString = new String[newStr.length];
        for(int i = 0 ; i < newStr.length-1 ; i++)
        {
            char[] chrarry = newStr[i].toCharArray();
            int k = 0;
            int j = chrarry.length-1;
            while (k<j)
            {
                char temp = chrarry[k];
                chrarry[k] = chrarry[j];
                chrarry[j] = temp;
                j--;
                k++;
            }
            String ans = new String(chrarry);
            updatedString[i] = ans;
        }
        for(int i = 0 ; i < updatedString.length-1 ; i++)
        {
            System.out.print(updatedString[i] + " ");
        }
    }
}
