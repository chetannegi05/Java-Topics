package String;

import Stack.ArrayStack;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        ArrayStack n = new ArrayStack(4);
        int ch = 0;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        do {
            System.out.println("Enter the Number");
            int b = sc.nextInt();
            System.out.println("Enter the 1 for Add. \n Enter 2 for subtract.\n Enter 3 for multiply.\n Enter 4 for Divide.\n Enter 5 for Break.");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    a = a + b;
                    System.out.println(a);
                    break;
                }
                case 2: {
                    a = a - b;
                    System.out.println(a);
                    break;
                }
                case 3: {
                    a = a * b;
                    System.out.println(a);
                    break;
                }
                case 4: {
                    if (b == 0) {
                        System.out.println("Not Defined");
                    } else {
                        a = a / b;
                        System.out.println(a);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Byee!!");
                    break;
                }
                default: {
                    System.out.println("Enter the Wrong number");
                }
            }
        } while (ch != 5);
    }
}