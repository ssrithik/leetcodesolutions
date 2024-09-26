class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int last = nums.length;
        int i;
        for(i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        List<Integer> t = new ArrayList<>();
        for(i=1;i<=last;i++)
        {
            if(!s.contains(i))
            {
              t.add(i);
            }
        }
        return t;

    }
}