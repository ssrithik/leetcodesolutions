class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int i;
       for(i=0;i<nums.length;i++)
       {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
       list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
       int[] res = new int[k];
       for(i=0;i<k;i++)
       {
        res[i] = list.get(i).getKey();
       }
       return res;

    }
}