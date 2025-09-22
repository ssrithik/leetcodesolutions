class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for(i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i]) > max)
            {
                max = hm.get(nums[i]);
            }
        }
        int count = 0;
        for(i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i]) == max)
            {
                count++;
            }
        }
        return count;
    }
}