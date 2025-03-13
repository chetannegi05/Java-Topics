package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] num2 = {2,4,6};
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums1)
        {
            set1.add(n);
        }
        for(int n : num2)
        {
            set2.add(n);
        }
        for (int n : set1)
        {
            if(set2.contains(n) == false)
            {
                list1.add(n);
            }
        }
        for(int n : set2)
        {
            if(set1.contains(n) == false)
            {
                list2.add(n);
            }
        }
        ans.add(list1);
        ans.add(list2);
        System.out.println(ans);
    }
}
