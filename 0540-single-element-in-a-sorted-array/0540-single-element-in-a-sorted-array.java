class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}