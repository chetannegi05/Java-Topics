package String;

public class ReverseString2 {
    public static void main(String[] args) {
        String s = "My name is Chetan Negi";
        String[] strArray = s.trim().split(" ");
        int start = 0;
        int end = strArray.length-1;
        while(start < end)
        {
            String temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
        String ans = String.join(" ", strArray);
        System.out.println(ans);
    }
}
