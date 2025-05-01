class Solution {
   public boolean canJump(int[] nums) {
    int reachable = 0; // Maximum position that can be reached
    
    for (int i = 0; i < nums.length; i++) {
// If the current index exceeds the maximum achievable, it fails
        if (i > reachable) {
            return false;
        }
        
        // Updating the maximum achievable position
        reachable = Math.max(reachable, i + nums[i]);
        
        // If we can achieve the last element, success
        if (reachable >= nums.length - 1) {
            return true;
        }
    }
    
    return true;
}
}