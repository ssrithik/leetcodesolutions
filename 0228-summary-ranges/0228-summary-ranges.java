class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> s = new ArrayList<>();
        int i=0,j=0;
        for(i=0;i<nums.length;i++)
        {
            j = i+1;
            while(j < nums.length && nums[j] == nums[j-1]+1)
            j++;

            if(i==j-1)
            {
                s.add(String.valueOf(nums[i]));
            }
            else
            {
                s.add(nums[i]+"->"+nums[j-1]);
            }
            i=j-1;
        }
        return s;
    }
}