class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];
        int i;
        for(i=1;i<nums.length;i++)
        {
            currentsum += nums[i];
            currentsum = Math.max(nums[i],currentsum);
            maxsum = Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
}