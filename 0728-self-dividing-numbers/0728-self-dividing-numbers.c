
int* selfDividingNumbers(int left, int right, int* returnSize) {
    int* arr = (int*)calloc(right-left,sizeof(int));
    int tmp,r=1;
    int flag=0;
int count=0;
    for(int i=left;i<=right;i++)
    {
        int z = i;
        int flag=1;
        while(z!=0)
        {
           int r = z%10;
           if(r==0 || i%r!=0)
           {
            flag=0;
            break;
           }
           z/=10;
        }
        if(flag == 1)
        {
           arr[count++] = i;
        }
        

    }
    *returnSize = count;
    return arr;
}