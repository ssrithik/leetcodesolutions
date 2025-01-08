class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           arr.add(index[i],nums[i]); 
        }
        int[] array = arr.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}