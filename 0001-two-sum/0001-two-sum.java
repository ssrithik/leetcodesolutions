class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> n = new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            int sum = target - nums[i];
            if(n.containsKey(sum))
            {
                return new int[]{i,n.get(sum)};
            }
            n.put(nums[i],i);
        }
        return new int[]{};
    }
}