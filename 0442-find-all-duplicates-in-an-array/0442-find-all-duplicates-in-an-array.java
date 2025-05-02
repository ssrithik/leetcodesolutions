class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer> st = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==2){
                st.add(entry.getKey());
            }
        }
        return st;
    }
}