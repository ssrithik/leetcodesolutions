class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> t = new ArrayList<>();

         int count=1;
         int i;
         for(i=1;i<s.length();i++)
         {
            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }
            else 
            {
                t.add(count);
                count=1;
            }
         }
         t.add(count);
         int sum=0;
         for(i=1;i<t.size();i++)
         {
           sum+=Math.min(t.get(i-1),t.get(i));
         }
         return sum;
    }
}