class Solution {
    public int minOperations(int[] nums, int k) {
        int i;
        int count=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] < k)
            {
                count++;
            }
        }
        return count;
    }
}