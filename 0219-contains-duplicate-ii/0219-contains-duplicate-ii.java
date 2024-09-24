class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j;
        int m = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<m;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int previousindex = map.get(nums[i]);
                if(i - previousindex <=k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}