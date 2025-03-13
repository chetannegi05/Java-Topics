package HashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMaps {
    public static void main(String args[])
    {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 1232);
        map.put("Australia" , 109);
        map.put("Canada" , 345);
        map.put("USA" , 7674564);
        map.put("Russia" , 3423423);

        //Iterate
        Set<String> k = map.keySet(); //String = Key

        for (String key : k)
        {
            System.out.println("Key =" + key + ", Values =" + map.get(key));
        }
    }
}
