class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int k=0;
        
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(s.contains(nums2[i]))
            {
                t.add(nums2[i]);
                s.remove((Integer) nums2[i]);
            }
        }
        int[] arr = new int[t.size()];
        for(int i=0;i<t.size();i++)
        {
            arr[i] =  t.get(i);
        }
       return arr;
    }
}