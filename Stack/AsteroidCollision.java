package Stack;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] ast = {5,10,-5};
        Stack<Integer> stack = new Stack<>();
        boolean explosed = false;
        for(int i : ast)
        {
            while(!stack.isEmpty() && i < 0 && 0< stack.peek())
            {
                if (Math.abs(i) > Math.abs(stack.peek()))
                {
                    stack.pop();
                    continue;
                }
                else if(Math.abs(i) == Math.abs(stack.peek()))
                {
                    stack.pop();
                }
                explosed = true;
                break;
            }
            if(!explosed)
            {
                stack.push(i);
            }
        }
        int[] newArr = new int[stack.size()];
        for (int i = newArr.length - 1; i >= 0; i--)
        {
            newArr[i] = stack.pop();
        }
        for(int i : newArr)
        {
            System.out.println(i);
        }
    }
}
