class Solution {
    public int longestNiceSubarray(int[] nums) {
       int left = 0;
       int right = 0;
       int maxsub = 0;
       int bitmask=0;
       while(right < nums.length)
       {
         while((bitmask & nums[right]) != 0)
         {
            bitmask ^= nums[left];
            left++;
         }
         bitmask |= nums[right];

           
            maxsub = Math.max(maxsub, right - left + 1);

            right++;
       }
       return maxsub;
    }
}