class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j;
        Set<List<Integer>> arr = new HashSet<>();
        for(i=0;i<nums.length;i++)
        {
            HashSet<Integer> hm = new HashSet<>();
            for(j=i+1;j<nums.length;j++)
            {
                int target = -(nums[i] + nums[j]);
                if(hm.contains(target))
                {
                    List<Integer> arr1 = new ArrayList<>();
                    arr1.add(nums[i]);
                    arr1.add(nums[j]);
                    arr1.add(target);
                    Collections.sort(arr1);
                    arr.add(arr1);
                }
                hm.add(nums[j]);
            }
        }
        return new ArrayList<>(arr);
    }
}