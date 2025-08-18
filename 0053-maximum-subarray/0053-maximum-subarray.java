class Solution {
    public int maxSubArray(int[] nums) {
         int maxsum = nums[0];
         int currentsum = nums[0];
         for(int i=1;i<nums.length;i++)
         {
            currentsum += nums[i];
            currentsum = Math.max(nums[i],currentsum);
            maxsum = Math.max(currentsum,maxsum);
         }
         return maxsum;
    }
}