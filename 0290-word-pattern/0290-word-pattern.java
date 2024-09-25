class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] n = s.split(" ");
        if(pattern.length() != n.length)
        {
            return false;
        }
        HashMap<Character,String> h = new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            if(!h.containsKey(pattern.charAt(i)))
            {
                if(!h.containsValue(n[i]))
                {
                    h.put(pattern.charAt(i),n[i]);

                }
                else
                {
                    return false;
                }
            }
            else if(n[i].compareTo(h.get(pattern.charAt(i)))!=0)
            {
                return false;
            }
        }
       return true;

    }
}