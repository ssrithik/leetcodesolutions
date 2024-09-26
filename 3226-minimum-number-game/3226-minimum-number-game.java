class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i;
        for(i=0;i<n;i+=2)
        {
            int temp = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = temp;

        }
        return nums;

    }
}