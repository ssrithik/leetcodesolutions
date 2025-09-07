class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0,maxsum=0;
        int i,j;
        for(i=0;i<k;i++)
        {
            sum += nums[i];
        }
        maxsum = sum;
        for(j=k;j<nums.length;j++)
        {
            sum += nums[j] - nums[j-k];
            if(sum > maxsum)
            {
                maxsum = sum;
            }
        }
        return (double) maxsum/k;
    }
}