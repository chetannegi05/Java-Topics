package String;

public class ReverseTheWordInString {
    public static void main(String args[])
    {
        String str = "My Name Is Chetan Negi";
        String[] strArray = str.split(" ");
        for(int i = 0 ; i < strArray.length ; i++)
        {
            String str2 = strArray[i];
            char[] chrArray = str2.toCharArray();
            int j = chrArray.length-1;
            for(int k = 0 ; k < j ; k++)
            {
                char temp = chrArray[j];
                chrArray[j] = chrArray[k];
                chrArray[k] = temp;
                j--;
            }
            String comapString = new String(chrArray);
            System.out.print(comapString + " ");
        }
    }
    
}
