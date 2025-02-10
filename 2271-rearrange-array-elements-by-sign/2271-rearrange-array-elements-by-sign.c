
int* rearrangeArray(int* nums, int numsSize, int* returnSize) {
    int i=0,j=1;
    int* nums1 = (int*)malloc(numsSize*sizeof(int));
    *returnSize = numsSize;
    int k;
    for(k=0;k<numsSize;k++)
    {
        if(nums[k]<0)
        {
            nums1[j] = nums[k];
            j+=2; 
        }
        else
        {
            nums1[i] = nums[k];
            i+=2;
        }
    }
    return nums1;
}