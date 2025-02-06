class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        int index=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length)
        {
            nums[index++] = 0;
        }

    }
}