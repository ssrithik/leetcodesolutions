class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            s.put(nums[i],s.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        int max=0;
        for(i=0;i<nums.length;i++)
        {
            if(s.get(nums[i])>(n/2))
            {
             max = nums[i];
            }
        }
        return max;
    }
}