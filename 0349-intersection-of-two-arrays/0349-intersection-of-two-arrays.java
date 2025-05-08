class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> s = new ArrayList<>();
        int i,j;
        for(i=0;i<nums1.length;i++)
        {
            for(j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    if(!s.contains(nums1[i]))
                    {
                        s.add(nums1[i]);
                    }
                }
            }
        }
        int[] arr = new int[s.size()];
        for(i=0;i<arr.length;i++)
        {
            arr[i] = s.get(i);
        }
        return arr;

    }
}