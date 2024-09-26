class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2)
        {
            return nums[nums.length-1];
        }
        HashSet<Integer> s = new HashSet<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        ArrayList<Integer> t = new ArrayList<>(s);
       
        Collections.sort(t);
        if(t.size() <= 2)
        {
            return t.get(t.size()-1);
        }
        return t.get(t.size()-3);
       
        

    }
}