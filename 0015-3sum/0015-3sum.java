class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> s  = new HashSet<>();
         int i,j;
         for(i=0;i<nums.length;i++)
         {
            HashSet<Integer> ht = new HashSet<>();
            for(j=i+1;j<nums.length;j++)
            {
                int third = -(nums[i]+nums[j]);
                if(ht.contains(third))
                {
                    List<Integer> set = new ArrayList<>();
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(third);
                    Collections.sort(set);
                    s.add(set);
                }
                ht.add(nums[j]);
            }
         }
         return new ArrayList<>(s);
    }
}