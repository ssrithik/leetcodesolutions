class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int a1=0;
        int a2=0;
        int i,j;
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        for(i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }
        for(i=0;i<nums2.length;i++)
        {
            t.add(nums2[i]);
        }
        for(i=0;i<nums1.length;i++)
        {
            if(t.contains(nums1[i]))
            {
                a1++;
            }
        }
        for(i=0;i<nums2.length;i++)
        {
            if(s.contains(nums2[i]))
            {
                a2++;
            }
        }
        int[] arr = new int[2];
        arr[0] = a1;
        arr[1] = a2;
        return arr;

    }
}