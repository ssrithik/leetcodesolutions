class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,k=0;
        for(i=0;i<nums1.length;i++)
        {
             if(nums1[i]==0 && i>m-1)
             {
                nums1[i] = nums2[k];
                k++;
             }
        }
        Arrays.sort(nums1);
    }
}