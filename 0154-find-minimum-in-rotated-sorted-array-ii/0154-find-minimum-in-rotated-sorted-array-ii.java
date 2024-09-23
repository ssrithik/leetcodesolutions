class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        return min;
    }
}