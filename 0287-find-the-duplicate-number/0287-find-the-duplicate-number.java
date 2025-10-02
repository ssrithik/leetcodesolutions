class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int i;
        for(i=0;i<nums.length;i++)
        {
            int z = hm.get(nums[i]);
            if(z > 1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}