class NumArray {
        private int[] nums;
    public NumArray(int[] nums) {
         this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int i;
        int sum=0;
        for(i = left;i<=right;i++)
        {
          sum += nums[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
