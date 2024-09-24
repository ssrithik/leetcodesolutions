class Solution {
    public int countGoodSubstrings(String s) {
        int m = s.length();
        int i;
        int count=0;
        for(i=0;i<m-2;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2))
            {
              count++;
            }
        }
        return count;
    }
}