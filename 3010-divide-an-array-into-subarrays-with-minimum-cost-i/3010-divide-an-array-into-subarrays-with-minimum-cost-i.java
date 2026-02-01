class Solution {
    public int minimumCost(int[] nums) {
        int cost = nums[0];
        int k = 2;
        int min = Integer.MAX_VALUE;
        int prevlocation = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        while(k > 0)
        {
            min = Integer.MAX_VALUE;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i] < min && i != prevlocation && !arr.contains(i))
                {
                    min = nums[i];
                    prevlocation = i;
                }
            }
            arr.add(prevlocation);
            cost += min;
            k--;
        }
        return cost;
    }
}