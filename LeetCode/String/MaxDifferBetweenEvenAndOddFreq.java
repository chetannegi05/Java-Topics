package LeetCode.String;

import java.util.HashMap;
import java.util.Map;

public class MaxDifferBetweenEvenAndOddFreq {
    public static void main(String[] args) {
        String s = "aaaacdddddd";
        Map<Character,Integer> map = new HashMap<>();
        for (char i : s.toCharArray())
        {
            map.put(i , map.getOrDefault(i,0)+1);
        }
        Integer maxOdd = null , minEven = null;
//        for ()
        for (int i : map.values())
        {
            if(i%2 == 0)
            {
                if(minEven == null || minEven > i)
                {
                    minEven = i;
                }
            }
            else
            {
                if(maxOdd == null || maxOdd < i)
                {
                    maxOdd = i;
                }
            }
        }
        if(maxOdd==null || minEven==null)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(maxOdd-minEven);
        }
    }
}
