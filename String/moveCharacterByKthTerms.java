package String;

public class moveCharacterByKthTerms {
    public static void main(String[] args)
    {
        String str = "abcdef";
        char[] chrArray = str.toCharArray();

        int k =2;
        int len = chrArray.length;
        int start =0;
        int end = chrArray.length-1;
        while(start < end)
        {
            char temp = chrArray[start];
            chrArray[start] = chrArray[end];
            chrArray[end] = temp;
            start++;
            end--;
        }
        start =0;
        end = k-1;
        while(start < k)
        {
            char temp = chrArray[start];
            chrArray[start] = chrArray[end];
            chrArray[end] = temp;
            start++;
            end--;
        }
        String ans = new String(chrArray);
        System.out.println(ans);
    }
}
