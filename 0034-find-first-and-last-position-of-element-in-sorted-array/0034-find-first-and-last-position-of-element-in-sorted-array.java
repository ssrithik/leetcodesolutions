class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i;
        int[] nums1 = new int[2];
        nums1[0] = -1;
        nums1[1] = -1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] == target && nums1[0]==-1)
            {
                 nums1[0] = i;
                 nums1[1] = i;
            }
            else if(nums[i] == target && ((nums1[0]==nums1[1]) && nums1[0]!=-1))
            {
                  nums1[1] = i;
            }
            else if(nums[i] == target && (nums1[1] < i))
            {
                nums1[1] = i;
            }

        }
        return nums1;
    }
}