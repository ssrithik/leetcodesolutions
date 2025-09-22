class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            Set<Integer> arr = new HashSet<>();
            for(j=i+1;j<nums.length;j++)
            {
                 int sum = -(nums[i]+nums[j]);
                 if(arr.contains(sum))
                 {
                    List<Integer> arr1 = new ArrayList<>();
                    arr1.add(nums[i]);
                    arr1.add(nums[j]);
                    arr1.add(sum);
                    Collections.sort(arr1);
                    set.add(arr1);
                 }
                 arr.add(nums[j]);
                  
            }

        }
        return new ArrayList<>(set);
    }
}