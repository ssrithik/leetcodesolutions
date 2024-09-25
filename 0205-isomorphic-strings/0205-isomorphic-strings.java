class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] a = new int[200];
        int[] b = new int[200];

        int len = s.length();
        if(len != t.length())
        {
            return false;
        }
        int i;
        for(i=0;i<len;i++)
        {
            if(a[s.charAt(i)] != b[t.charAt(i)])
            {
                return false;
            }
            a[s.charAt(i)] = i+1;
            b[t.charAt(i)] = i+1;
        }
        return true;
        }
        
    }
