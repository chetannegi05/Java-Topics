import java.util.*;
public class JavaInput {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       // String fname = sc.next(); use for a word
       // System.out.println(fname); 
        String lname = sc.nextLine(); /*used for sentences */
        System.out.println(lname);
        int number = sc.nextInt();/*used for number input */
        System.out.println(number);
        sc.close();

    }
}
