class Solution {
    public int countDigits(int num) {
        if(num<10)
        return 1;
        int count=0;
        int r = num;
        while(r > 0)
        {
             
            int q = r%10;
          
            if(num%q==0)
            {
            count++;
            }
            r = r/10;
           

        }
        return count;

    }
}