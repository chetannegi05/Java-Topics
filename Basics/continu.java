import java.util.*;
public class continu {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Enter the number = ");
            int a = sc.nextInt();
            sc.close();
            if(a%10 == 0)
            {
                continue;
            }
            System.out.println(a);
        } while (true);
    }
}
