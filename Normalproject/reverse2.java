package Normalproject;

public class reverse2 {
    public static void main(String args[])
    {
        String name = "Bob";
        name = name.toLowerCase();
        char[] nameArray = name.toCharArray();
        int j = nameArray.length -1;
        for(int i = 0 ; i < j ; i++)
        {
            char temp = nameArray[i];
            nameArray[i] = nameArray[j];
            nameArray[j] = temp;
            j--;
        }
        String comapareString = new String(nameArray);
        if((name.equals(comapareString)))
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not an palindrome");
        }
        // String ans = "";
        // for(int i = 0 ; i < name.length() ; i++)
        // {
        //     ans = name.charAt(i) + ans;
        // }

       // System.out.println(ans);

    

        // String.join(" ", nameArray);
        name = String.valueOf(nameArray);
        // System.out.println(name);

        // usingStringBuilder(name);
        
    }

    public static void usingStringBuilder(String name){
        StringBuilder sb = new StringBuilder(name);
        int j = sb.length()-1;

        for(int i = 0 ; i < j ; i++){
            char temp = sb.charAt(i);
            sb.insert(i,sb.charAt(j));
            sb.insert(j, temp);
            j--;
        }

        System.out.println(sb.toString());

    }


}
