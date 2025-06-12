class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        int i;
        max = Math.abs(nums[0]-nums[nums.length-1]);
        for(i=0;i<nums.length-1;i++)
        {
           int diff = Math.abs(nums[i+1]-nums[i]);
           if(diff > max)
           {
            max = diff;
           }
        }
        return max;
    }
}