class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> s = new HashSet<>();
        int i,j,k;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                HashSet<Long> set = new HashSet<>();

                for(k=j+1;k<nums.length;k++)
                {
                 long sum = (long)nums[i]+nums[j]+nums[k];
                   long fourth = (long)target - sum;
                   if(set.contains(fourth))
                   {
                        ArrayList<Integer> m = new ArrayList<>();
                        m.add(nums[i]);
                        m.add(nums[j]);
                        m.add(nums[k]);
                        m.add((int)fourth);
                        Collections.sort(m);
                        s.add(m);
                   } 
                   set.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(s);
    }
}