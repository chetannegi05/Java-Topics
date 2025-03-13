package LeetCode.Integer;

public class IncreasingTripletSequence {
    public static void main(String args[])
    {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        boolean ans = check(nums);
        System.out.println(ans);
    }
    public static boolean check(int[]nums)
    {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums)
        {
            if(n<=max1)
            {
                max1 = n;
            } else if (n <= max2) {
                max2 = n;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
