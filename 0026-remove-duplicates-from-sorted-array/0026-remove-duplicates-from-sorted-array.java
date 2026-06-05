class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int j=1,i;
        for(i=1;i<nums.length;i++)
        {
           if(nums[i-1] != nums[i])
           {
            nums[j] = nums[i];
            j++;
           }
        }
       return j;
    }
}