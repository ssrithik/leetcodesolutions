class Solution {
    public boolean lemonadeChange(int[] arr) {
        // int i;
        // int[] change = new int[3];
        // for(i=0;i<arr.length;i++)
        // {
           
        //    if(arr[i]==5) 
        //    {change[0]++;
        //    System.out.println(change[0]+" "+change[1]);
        //    }
        //    else if(arr[i]==10)
        //    {
        //     if(change[0] ==0)
        //     {
        //     return false;
        //     }
        //     change[1]++;
        //     change[0]--;
        //     System.out.println(change[0]+" "+change[1]);

            
        //    }
        //    else if(arr[i]==20)
        //    {
        //     if(change[1]==0 && change[0] < 3)
        //     {
        //             return false;
        //     }
        //     else if(change[1]>0 && change[0]==0)
        //     {
        //         return false;
        //     }
        //     else if(change[1] > 0 && change[0]>=1)
        //     {
        //         change[1]--;
        //         change[0]--;
              
        //     }
        //     else if(change[0] >=3)
        //     {
        //         change[0] = change[0]-3;
               
        //     }
        //     System.out.println(change[0]+" "+change[1]);
        //    }
        // }
        
        // if(change[0] <  0 || change[1] < 0)
        // {
        //     return false;
        // }
        // else
        // return true;
        int i;
        int five=0;
        int ten=0;
        for(i=0;i<arr.length;i++)
        {
            int pay = arr[i];
            if(pay == 5)
            {
                five++;
            }
            else if(pay == 10)
            {
                if(five <= 0)
                {
                    return false;
                }
                else
                {
                    ten++;
                    five--;
                }
            }
            else if(pay == 20)
            {
                if((ten<1 && five <3) || (ten>0 && five<1))
                {
                    return false;
                }
                else
                {
                    if(ten>0)
                    {
                        ten--;
                        five--;
                    }
                    else if(five >= 3)
                    {
                        five = five-3;
                    }
                }
            }
        }
        return true;
    }
}