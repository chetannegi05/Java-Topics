package LeetCode.Integer;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};    //1,2,3,4
        int n  = nums.length;
        int[] a = new int[n];
        int temp =1;
        for(int i = 0; i < n ; i++)
        {
            a[i] = temp;
            temp = temp * nums[i];
        }
        int tmp =1;
        for(int i = n-1  ; i >= 0 ; i--)
        {
            a[i] *= tmp;
            tmp *= nums[i];
        }
        for(int i  = 0  ; i < n ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
