class Solution {
    public void sortColors(int[] a) {
        //  HashMap<Integer,Integer> s = new HashMap<>();
        // s.put(0,0);
        // s.put(1,0);
        // s.put(2,0);
        // for(int n: nums)
        // {
        //     s.put

        // }
        int middle = 0;
        int low=0;
        int high = a.length-1;
        int temp;
        int i;
       
        while(middle <=high)
        {
           
            if(a[middle] == 0)
            {
                   temp = a[middle];
                   a[middle] = a[low];
                   a[low] = temp;
                   low++;
                   middle++;
            }
            else if(a[middle] == 1)
            {
                middle++;
            }
            else if(a[middle]==2)
            {
                temp = a[middle];
                a[middle] = a[high];
                a[high] = temp;
                high--;
            }
            
            
        }
        
        


         

    }
}