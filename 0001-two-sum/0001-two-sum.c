
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* result = (int*)malloc(2*sizeof(int));
    int i,j;
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                result[0] = i;
                result[1] = j;
                *returnSize=2;
                return result;
            }
        }
       
    }
     *returnSize=0;
        return NULL;
}