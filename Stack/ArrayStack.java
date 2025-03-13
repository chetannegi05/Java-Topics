package Stack;

import java.util.Scanner;

public class ArrayStack { //class name


    private int[] ar; // attribute / identifier / data member
    int top = 0;

    //Constructor
    public ArrayStack(int range) {
        ar = new int[range];
    }

    public ArrayStack() {
        ar = new int[5];
    }

    public static void main(String[] args) //method / defines behaviour
    {

//        ask user for size
//        ar = new int[5];

        int ch = 0, n=0;
        ArrayStack stack = new ArrayStack(15);
        ArrayStack stack1 = new ArrayStack();
        do {

            System.out.println("Enter 1 for insert\n Enter 2 for Display\n Enter 3 for Delete\n Enter 4 for break\n");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter the number to Push");
                    n = sc.nextInt();
                    stack.push(n);
                    break;
                }
                case 2: {
                    stack.peek();
                    break;
                }
                case 3: {
                    stack.pop();
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Enter the number between 1-4");
                }
            }
        } while (ch != 4);
    }

    public void push(int n)
    {
        if(top == ar.length)
        {
            System.out.println("Stack Is OverFlow");
        }
        else
        {
            ar[top] = n;
            top++;
        }
    }
    public void peek()
    {
        if(top == 0)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(ar[top]);
        }
    }
    public void pop()
    {
        int topValue =0 ;
        if(top == 0)
        {
            System.out.println("Stack is empty");
        }
        else {
            topValue = top;
            top--;
            System.out.println(topValue);
        }
    }
}