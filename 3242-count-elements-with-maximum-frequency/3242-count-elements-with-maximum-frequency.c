int maxFrequencyElements(int* nums, int numsSize) {
    int maxcount = 0;
    int counting[numsSize];
    int visited[numsSize];
    int i,j;
    int count = 0;
    for (i = 0; i < numsSize; i++) {
        visited[i] = 0;
        counting[i] = 0;
    }
    for(i=0;i<numsSize;i++)
    {
        if(visited[i] == 0)
        {
        for(j=0;j<numsSize;j++)
        {
            if(nums[i]==nums[j])
            {
                count++;
                
                visited[j] = 1;
            }

        }
        if(count > maxcount)
        {
            maxcount = count;
        }
        counting[i] = count;
        count = 0;
        }
    }
    int total = 0;
    for(i=0;i<numsSize;i++)
    {
        if(counting[i]==maxcount)
        {
            total += counting[i];
        }
    }
    return total;
}