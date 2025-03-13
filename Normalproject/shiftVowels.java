package Normalproject;

public class shiftVowels {
    public static void main(String args[])
    {    
        String[] str = {"insertion"};
        for(int i = 0 ; i < str.length ; i++)
        {
            String currentStr = " ";
            for(int j = i+1 ; j < str.length ; i++)
            {
                if(str[i] == "a" || str[i] == "e" || str[i] == "i" || str[i] == "o" || str[i] == "u" )
                {
                    if(str[j] == "a" || str[j] == "e" || str[j] == "i" || str[j] == "o" || str[j] == "u")
                    {
                        currentStr = str[j];
                        str[j] = str[i];
                        str[i] = currentStr;
                    }
                }
            }
        }    
        for(int i = 0 ; i < str.length ; i++)
        {
            System.out.println(str[i]);
        }
    }
}
