class Solution {
    public boolean predictTheWinner(int[] nums) {
        if(nums.length==1 || nums.length==2)
        return true;

         return solve(nums,0,nums.length-1) >=0;
    }
    public 
    int solve(int[] nums,int left,int right)
    {
        if(left == right)
        {
            return nums[left];
        }
        int pl = nums[left] - solve(nums,left+1,right);
        int p2 = nums[right] - solve(nums,left,right-1);
        
        return Math.max(pl,p2);

    }
}