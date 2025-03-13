package LeetCode.Integer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxNumberOfKsumPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3}; //ans  = 1;
        int k = 6;
        Arrays.sort(nums);
        int count = 0;
        int start = 0;
        int end = nums.length-1;
        while (start < end)
        {
            int sum = nums[start] + nums[end];
            if((sum) == k)
            {
                count++;
                start++;
                end--;
            }
            else if(sum > k)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        System.out.println(count);
    }
}
