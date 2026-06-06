class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        for(int j=k;j<nums.length;j++)
        {
            nums[j] = 0;
        }
    }
}