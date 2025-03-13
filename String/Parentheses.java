package String;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args)
    {
        String str = "()()(()(()))";
        boolean a = isValid(str);
        System.out.println(a);
    }
    public static boolean isValid(String str)
    {
        Stack<Character>paranthesis = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(ch == '(')
            {
                paranthesis.push(ch);
            } else if (ch == ')') {
                if (paranthesis.isEmpty())
                {
                    return false;
                }
                paranthesis.pop();
            }
        }
        return paranthesis.isEmpty();
    }
}
