class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int a=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               nums[a] = nums[i];
               a++;
            }
        }
        for(i=a;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
    }
}