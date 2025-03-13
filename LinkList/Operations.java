//package LinkList;
//
//import java.util.Scanner;
//
//class Node
//{
//    int data;
//    Node next;
//
//    Node(int data)
//    {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList
//{
//    Node head;
//
//    public void push(int data)
//    {
//        Node newNode = new Node(data);
//        if(head == null)
//        {
//            head = newNode;
//            return;
//        }
//    }
//}
//public class Operations {
//    public static void main(String[] args) {
//        int ch,data,del;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter 1 to push\n Enter 2 for pop\n Enter 3 for peek\n Enter 4 for break\n");
//            ch = sc.nextInt();
//            switch (ch)
//            {
//                case 1:
//                {
//                    System.out.println("Enter the element");
//                    data = sc.nextInt();
//                    push(data);
//                    break;
//                }
//                case 2:
//                {
//                    del = pop();
//                    System.out.println("Pop Element is " + del);
//                    break;
//                }
//                case 3:
//                {
//                    peek();
//                    break;
//                }
//                case 4:
//                {
//                    break;
//                }
//                default:
//                {
//                    System.out.println("Enter the number between 1 to 4");
//                }
//            }
//        }while (ch!=4);
//    }
//}
