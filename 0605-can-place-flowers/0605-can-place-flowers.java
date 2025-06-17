class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]!=1)
        {
            return true;
        }
        if(n==0)
        return true;
        for(int i=0;i<flowerbed.length-1;i++)
        {
            if(i==0 && flowerbed[i+1]==0 && flowerbed[i]!=1)
            {
                flowerbed[i]=1;
                n--;
            }
            else if(i!=0 && flowerbed[i]!=1 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i] = 1;
                n--;
            }
            if(n==0)
            {
                return true;
            }
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
        {
            flowerbed[flowerbed.length-1]=1;
            n--;
        }
        if(n==0)
        {
            return true;
        }
        return false;
    }
}