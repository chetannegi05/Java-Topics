package LeetCode.Integer;

public class AddOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] a = new int[nums.length];
        int start = 0;
        while (start < nums.length)
        {
            for(int inner = 0; inner < nums.length ; inner++)
            {
                if(nums[start] == nums[inner])
                {
                    a[start] = a[start] + 1;
                }
                else
                {
                    a[start] = a[start] + nums[inner];
                }
            }
            start++;
        }
        for (int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
