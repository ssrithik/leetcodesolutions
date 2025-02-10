#define MAX 10000000
int reverse(int n)
{
    int sum=0;
    while(n>0)
    {
        int rem = n%10;
        sum = sum*10 + rem;
        n = n/10;
    }
    return sum;
}
int distinctcount(int* nums1,int n)
{
    int hash[MAX] = {0};
    int count=0;
    int i;
    for(i=0;i<n;i++)
    {
        if(hash[nums1[i]] == 0)
        {
            count++;
        }
        hash[nums1[i]]++;
    }
    return count;
}
int countDistinctIntegers(int* nums, int numsSize) {
  int i,j;
    int n = numsSize*2;
  int* nums1 = (int*)malloc(n*sizeof(int));

  for(i=0;i<numsSize;i++)
  {
    nums1[i] = nums[i];
  }
  int index=0;
  for(i=numsSize;i<n;i++)
  {
    nums1[i] = reverse(nums[index]);
    index++;
  }

  return distinctcount(nums1,n);
   
}
