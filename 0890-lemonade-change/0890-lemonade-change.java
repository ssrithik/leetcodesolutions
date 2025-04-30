class Solution {
    public boolean lemonadeChange(int[] arr) {
        int i;
        int[] change = new int[3];
        for(i=0;i<arr.length;i++)
        {
           
           if(arr[i]==5) 
           {change[0]++;
           System.out.println(change[0]+" "+change[1]);
           }
           else if(arr[i]==10)
           {
            if(change[0] ==0)
            {
            return false;
            }
            change[1]++;
            change[0]--;
            System.out.println(change[0]+" "+change[1]);

            
           }
           else if(arr[i]==20)
           {
            if(change[1]==0 && change[0] < 3)
            {
                    return false;
            }
            else if(change[1]>0 && change[0]==0)
            {
                return false;
            }
            else if(change[1] > 0 && change[0]>=1)
            {
                change[1]--;
                change[0]--;
              
            }
            else if(change[0] >=3)
            {
                change[0] = change[0]-3;
               
            }
            System.out.println(change[0]+" "+change[1]);
           }
        }
        System.out.println(change[0]+" "+change[1]);
        if(change[0] <  0 || change[1] < 0)
        {
            return false;
        }
        else
        return true;
    }
}