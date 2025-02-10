
int* rearrangeArray(int* nums, int numsSize, int* returnSize) {
    int n = numsSize/2;
    int* arr = (int*)malloc(n*sizeof(int));
    int* arr1 = (int*)malloc(n*sizeof(int));
    int i;
    int index1=0;
    int index2=0;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i] > 0)
        {
            arr[index1] = nums[i];
            index1++;
        }
        else if(nums[i] < 0)
        {
            arr1[index2] = nums[i];
            index2++;
        }
    }
    *returnSize = numsSize;
    index1=0;
    index2=0;
    int* nums1 = (int*)malloc(numsSize*sizeof(int));
    for(i=0;i<numsSize;i++)
    {
         if(i%2==0)
         {
             nums1[i] = arr[index1];
             index1++;
         }
         else
         {
            nums1[i] = arr1[index2];
            index2++;
         }
    }
    return nums1;
}