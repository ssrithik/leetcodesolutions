class Solution {
    public int maxSubArray(int[] nums) {
        
        int i,j;
        int current = nums[0];
        int max = nums[0];
        for(i=1;i<nums.length;i++)
        {
           current = Math.max(nums[i],current+nums[i]);
           max = Math.max(max,current);
        }
        return max;
    }
}