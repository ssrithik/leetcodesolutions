class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        int max=0;
        int sum=0,maxsum=0;
        for(i=0;i<k;i++)
        {
           sum+= nums[i];
        }
        maxsum=sum;
        for(j=k;j<nums.length;j++)
        {
            sum+= nums[j] - nums[j-k];
            if(sum > maxsum)
            {
                maxsum=sum;
            }

        }
        double ans = (double)maxsum/k;
        return ans;
    }
}