/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extra, int* returnSize) {
    bool* arr = (bool*)malloc(candiesSize*sizeof(bool));
    int max=0;
    int i;
    *returnSize = candiesSize;
    int n = candiesSize;
    for(i=0;i<n;i++)
    {
        if(candies[i] > max)
        {
            max=candies[i];
        }
    }
    for(i=0;i<n;i++)
    {
        if(candies[i]+extra >= max)
        {
            arr[i] = true;
        }
        else
        {
            arr[i] = false;
        }
        
    }
    return arr;
}