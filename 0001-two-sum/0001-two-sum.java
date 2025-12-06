class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        hm.put(nums[0],0);
        for(i=1;i<nums.length;i++)
        {
            int tar = target - nums[i];
            if(hm.containsKey(tar))
            {
                return new int[]{hm.get(tar),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}