package Queue;

import java.util.Scanner;

public class QueueImplimentationInArray {
    public int[] ar; // attribute / identifier / data member
    int front = 0 , rear = 0;
    public QueueImplimentationInArray(int range) {
        ar = new int[range];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array\n");

        int range = sc.nextInt();
        int ch = 0;
        QueueImplimentationInArray queue = new QueueImplimentationInArray(range);
        do {
            System.out.println("Enter 1 for insert\n Enter 2 for Display\n Enter 3 for Delete\n Enter 4 for break\n");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    //push
                    System.out.println("Enter the number to push =");
                    int n = sc.nextInt();
                    queue.push(n);
                    break;
                }
                case 2:
                {
                    queue.peek();
                    break;
                    //display
                }
                case 3:
                {
                    queue.pop();
                    break;
                    //delete
                }
                case 4:
                {
                    break;
                }
                default:
                {
                    System.out.println("Enter the Wrong number!!!  Enter between 1 to 4");
                }
            }
        }while (ch!=4);
    }
    public  void push(int n)
    {
        if(rear == ar.length)
        {
            System.out.println("Queue is OverFlow\n");
        }
        else
        {
            ar[rear] = n;
            rear++;
        }
    }
    public void peek()
    {
        if(rear == 0)
        {
            System.out.println("Queue is UnderFlow\n");
        }
        else
        {
            System.out.println(ar[front]);
        }
    }
    public void pop()
    {
        if(rear == 0 && front == 0)
        {
            System.out.println("Queue is UnderFlow\n");
        }
        else
        {
           int frontValue = ar[front];
           front++;
           rear--;
            System.out.println("Pop value is =" + frontValue);
        }
    }
}
