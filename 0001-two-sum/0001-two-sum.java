class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            int rem = target - nums[i];
            if(hm.containsKey(rem))
            {
                return new int[]{hm.get(rem),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}