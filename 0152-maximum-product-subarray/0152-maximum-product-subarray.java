class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = nums[0];
        int pro = nums[0];
        int i;
        for(i=1;i<nums.length;i++)
        {
             
                pro *= nums[i];
             pro = Math.max(pro,nums[i]);
             maxproduct  = Math.max(pro,maxproduct);

        }
        return maxproduct;
    }
}