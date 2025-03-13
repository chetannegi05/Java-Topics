package Stack;

import java.util.Stack;

public class RemovingStarFromTheString {
    public static void main(String[] args) {

        String s = "*leet**cod*e"; //output = "lecoe";
        Stack<Character> pStack = new Stack<>();
        char[] chrArray = s.toCharArray();
        int start = 0;
        while( start < chrArray.length)
        {
            if(chrArray[start] == '*')
            {
                if (!pStack.isEmpty()) {
                    pStack.pop(); // Remove the last character when '*' is encountered
                }
            }
            else
            {
                pStack.push(chrArray[start]);
            }
            start++;
        }
        StringBuilder result = new StringBuilder();
        for(char ch : pStack)
        {
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
