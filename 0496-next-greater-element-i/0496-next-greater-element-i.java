class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //    int[] m = new int[nums1.length];
    //    int i,j,k;
    //    int index=0;
    //    for(i=0;i<nums1.length;i++)
    //    {
    //     for(j=0;j<nums2.length;j++)
    //     {
    //         if(nums1[i]==nums2[j])
    //         {
    //             for(k=j+1;k<nums2.length;k++)
    //             {
    //                 if(nums2[k] > nums2[j])
    //                 {
    //                    m[index++] = nums2[k];
    //                    continue;
    //                 }
    //             }
    //             m[index++] = -1;
    //         }

    //     }
    //    }
    //    return m;
    int[] arr = new int[nums1.length];
    int i=0,j=0;
    int k=0;
    int index=0;
    for(i=0;i<nums1.length;i++)
    {int found=-1;
        for(j=0;j<nums2.length;j++)
        {
            if(nums1[i] == nums2[j])
            {
                for(k=j+1;k<nums2.length;k++)
                {
                    if(nums2[j] < nums2[k])
                    {
                        found=nums2[k];
                        
                        break;
                    }
                   
                       
                    
                }
                break;
            }
        }
        arr[i] = found;
    }
    return arr;
    

    }
}