class Solution {
    public int longestConsecutive(int[] nums) {
       
       if(nums.length == 0)
       {
        return 0;
       }
       int count=1;
       int Maxcount=0;
      HashSet<Integer> s = new HashSet<>();
      int i;
      for(i=0;i<nums.length;i++)
      {
        s.add(nums[i]);
      }
      List<Integer> m = new ArrayList<>(s);

     Collections.sort(m);
     for(i=0;i<m.size();i++)
     {
        System.out.print(m.get(i)+" ");
     }
      for(i=1;i<m.size();i++)
      {
        if(m.get(i)-m.get(i-1)==1)
        {
            count++;
        }
        else
        {
            if(count >= Maxcount)
            {
                Maxcount = count;
               
            }
             count=1;
        }
        
      }
      if(count > Maxcount)
      {
        Maxcount = count;
      }
     
      return Maxcount;
    }
}