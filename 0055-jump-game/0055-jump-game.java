class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(i > reachable)
            return false;
            reachable = Math.max(reachable,i+nums[i]);

        }
        return true;
    }
}