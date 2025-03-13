package String;

import Stack.ArrayStack;

public class concatinateAndSpace {
    public static void main(String args[])
    {
        ArrayStack stack = new ArrayStack();
        ArrayStack stack1 = new ArrayStack(15);

        stack.pop();
        stack1.push(1);



        String a = "Chetan is awake";
        String b = a.replace("", " ").trim();
        System.out.println(b);
    }
}
