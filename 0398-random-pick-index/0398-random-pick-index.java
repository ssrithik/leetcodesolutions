class Solution {
     private int[] nums;
     private Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    public int pick(int target) {
        List<Integer> s = new ArrayList<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                s.add(i);
            }
        }
        int r = random.nextInt(s.size());
        return s.get(r);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */