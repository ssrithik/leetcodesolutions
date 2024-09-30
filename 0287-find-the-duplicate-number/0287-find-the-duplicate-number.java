class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            s.put(nums[i],s.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            int z = s.get(nums[i]);
            if(z>1)
            {
                return nums[i];
            }
        }
        return 0;
        
    }
}