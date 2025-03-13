package HashMap;
import java.util.*;
public class CreateHashT {
    public static void main(String args[])
    {
        String str = "Chetan Negi";
        HashMap<String, Integer> map = new HashMap<>(); //Empty Hashmap Initialize in Memory
        // Insertion - 0(1)
        map.put("India",1200);
        map.put("China",100);
        map.put("Australia",12);
        map.put("Japan",3421);
        map.put("USA",1200);
        System.out.println(map); //Hashmap is an unordered map in java
        // Get - 0(1)
        int value = map.get("India");
        System.out.println(value);
        System.out.println(map.get("Canada")); //Return Null Value bcz Canada is not exists in hashmap
        // containsKey - 0(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Canada"));

        //Remove - 0(1)
        map.remove("China");
        System.out.println(map);

        //size - 0(1)
        System.out.println(map.size());

        //clear
        map.clear();
        System.out.println(map);
    }
}
