package HashMap;

import java.util.HashMap;
import java.util.Set;

public class CalculateCharacter {
    public static void main(String[] args) {

        String name = "chetannegi";
        char[] arry = name.toCharArray();
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arry.length ; i++)
        {
            char currentChar = arry[i];
            map.put(currentChar, map.getOrDefault(currentChar,0)+1);
        }
        Set<Character> k = map.keySet(); //String = Key

        for (Character key : k)
        {
            System.out.println("Key =" + key + ", Values =" + map.get(key));
        }
    }
}
