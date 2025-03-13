package LinkList;

import java.util.Scanner;

public class LinkListPerformance {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    void display()
    {
        Node q = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(q!=null)
            {
                System.out.print(q.data + "->");
                q=q.next;
            }
            System.out.println("null");
        }
    }
    void removeFirst()
    {
        Node q = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Deletion element is "+ q.data);
            head = q.next;
        }
    }
    void addLast(int data)
    {
        Node newNode = new Node(data);
        Node q = head;
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args)
    {
        int data,ch;
        LinkListPerformance ll = new LinkListPerformance();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter 1 for insert\nEnter 2 for Display\nEnter 3 for Delete\nEnter 4 for lastInsert\nEnter 5 for break\n");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("Enter the element to insert");
                    data = sc.nextInt();
                    ll.addFirst(data);
                    break;
                }
                case 2:
                {
                    ll.display();
                    break;
                }
                case 3:
                {
                    ll.removeFirst();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the element to insert at last");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;
                }
                case 5:
                {
                    break;
                }
                default:
                {
                    System.out.println("Enter valid choice");
                }
            }
        }while (ch!=5);
    }
}
