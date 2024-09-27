class Solution {
    public int maximizeSum(int[] nums, int k) {
        int i;
        int max=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max=nums[i];
            }
        }
        int sum=0;
        while(k-- > 0)
        {
             sum+=max;
             max=max+1;
        }
        return sum;
    }
}