class Solution {
    public int findPeakElement(int[] nums) {
        int i;
        int n = nums.length;
        
        for(i=1;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
            {
                return i;
            }
        }
        if(n>=2 && nums[0] > nums[1])
        {
            return 0;
        }
        
        return n-1;
    }
}