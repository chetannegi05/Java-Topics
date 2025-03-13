package String;
import java.util.Stack;
public class ForAllValidString {
    Object object;
    public static void main(String args[])
    {
        String s = "()(){{}}]";
        boolean result = isValid(s);
        System.out.println("Is the string valid?\n" + result);
    }
    public static boolean isValid(String s) {
        Stack<Character>pStack = new Stack<>();
        if(s.isEmpty())
        {
            return true;
        }
        char[] chr = s.toCharArray();
        for(int i  = 0 ; i < chr.length ; i++)
        {
            if(chr[i] == '(' || chr[i] == '[' || chr[i] == '{')
            {
               pStack.push(chr[i]);
            }
            else if(chr[i] == ')' && !pStack.isEmpty() &&  pStack.peek() == '(' || chr[i] == ']' && !pStack.isEmpty() && pStack.peek() == '[' || chr[i] == '}' && !pStack.isEmpty() && pStack.peek() == '{')
            {
                pStack.pop();
            }
            else
            {
                return false;
            }
        }
        return pStack.isEmpty();
    }
}