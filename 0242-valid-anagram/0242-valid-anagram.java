class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
         int i;
         for(i=0;i<s.length();i++)
         {
          
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
         }
         for(i=0;i<t.length();i++)
         {
            char c = t.charAt(i);
            if(hm.containsKey(c))
            {
                  if(hm.get(c) == 0)
                  {
                    return false;
                  }
                  else
                  {
                     hm.put(c,hm.get(c)-1);
                  }
            }
            else
            {
                return false;
            }
         }
         return true;
    }
}