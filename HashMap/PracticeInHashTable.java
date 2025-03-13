package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PracticeInHashTable {
    public static void main(String args[])
    {
        HashMap<Integer,String>app = new HashMap<>();
        int key =0 ;
        int ch =0 ;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for insert the value\n Enter 2 for get the value \n Enter 3 for Display HashTable the value\n Enter 4 for break\n");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.print("Enter the key=");
                    key = sc.nextInt();
                    System.out.println("Enter your Value");
                    String value = sc.next();
                    app.put(key, value);
                    System.out.println(app);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the key to get the value=");
                    int display = sc.nextInt();
                    System.out.println(app.get(display));
                    break;
                }
                case 3:
                {
                    Set<Integer> k = app.keySet();
                    for (int a : k)
                    {
                        System.out.println(app.get(a));
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Thanks for visit take care");
                    break;
                }
                default:
                {
                    System.out.println("Enter The Wrong Number");
                }
            }
        }while(ch!=4);
    }
}
