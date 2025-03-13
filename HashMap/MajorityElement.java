package HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int[] num = {1,3,2,5,1,3,1,5,1};
        int compare = num.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i = 0 ; i < num.length ; i++)
        {
            int check = num[i];
//            if(map.containsKey(check))
//            {
//                map.put(check,map.get(check)+1);
//            }
//            else
//            {
//                map.put(check,1);
//            }
            map.put(check,map.getOrDefault(check,0)+1);
        }
        System.out.println(map);
//        Set<Integer> keySet = map.keySet();
        for(Integer key : map.keySet())
        {
            if(map.get(key) > compare)
            {
                System.out.println(key);
            }
        }
        System.out.println(map.keySet());
    }
}
