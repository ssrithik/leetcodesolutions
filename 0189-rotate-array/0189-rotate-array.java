class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    void reverse(int[] nums, int first,int last)
    {
        while(first<last)
        {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last]  = temp;
        first++;
        last--;
        }
    }
}