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
    public static Node head;
    public static Node tail;
    public static int size;
    void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
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
//        Node q = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else if(size == 1)
        {
            System.out.println(head.data);
            head = tail = null;
            size = 0;
        }
        else
        {
            System.out.println("Deletion element is "+ head.data);
            head = head.next;
            size--;
        }
    }
    void addLast(int data)
    {
        Node newNode = new Node(data);
        Node q = head;
        size++;
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
    void addAtMiddle(int pos,int data)
    {
        int count=0;
        Node newNode = new Node(data);
        Node prev = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else if(pos == 0)
        {
            addFirst(data);
        }
        else if (pos == size)
        {
            addLast(data);
        }
        else
        {
            while(count != (pos-1))
            {
                prev = prev.next;
                count++;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }
    void removeLast()
    {
        Node q = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else if(size == 1)
        {
            System.out.println(head.data);
            head = tail = null;
            size = 0;
        }
        else
        {
            System.out.println("Deletion element is "+ tail.data);
            while(q.next.next != null)
            {
                q = q.next;
            }
            q.next = null;
            tail = q;
            size--;
        }
    }
    int search(int key)
    {
        Node q = head;
        int i = 0;
        while(q!=null)
        {
            if(q.data == key)
            {
                return i;
            }
            q = q.next;
            i++;
        }
        return -1;
    }
    void reverse() //TimeComplexity(0(n))
    {
        Node prev = null;
        Node curr = tail = head;
        Node nnext;
        while(curr!=null)
        {
            nnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nnext;
        }
        head = prev;
    }
    public static void main(String[] args)
    {
        int data,ch,key;
        LinkListPerformance ll = new LinkListPerformance();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter 1 for insert\nEnter 2 for Display\nEnter 3 for Delete\nEnter 4 for lastInsert\nEnter 5 for insert in pos\nEnter 6 for size of LinkedList\nEnter 7 for RemoveLast\nEnter 8 for search\nEnter 9 for Reverse\nEnter 10 for break\n");
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
                    int pos;
                    System.out.println("Enter the element to insert");
                    data = sc.nextInt();
                    System.out.println("Enter the position to insert");
                    pos = sc.nextInt();
                    ll.addAtMiddle( pos, data);
                    break;
                }
                case 6:
                {
                    System.out.println("Size of LinkedList " + ll.size);
                    break;
                }
                case 7:
                {
                    ll.removeLast();
                    break;
                }
                case 8:
                {
                    System.out.println("Enter the element to check");
                    key = sc.nextInt();
                    int ans = ll.search(key);
                    if(ans == -1)
                    {
                        System.out.println("Element not found");
                        break;
                    }
                    System.out.println("Element is present at index "+ ans);
                    break;
                }
                case 9:
                {
                    ll.reverse();
                    break;
                }
                case 10:
                {
                    break;
                }
                default:
                {
                    System.out.println("Enter valid choice");
                }
            }
        }while (ch!=10);
    }
}
