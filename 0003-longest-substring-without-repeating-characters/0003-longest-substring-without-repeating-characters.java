class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> m = new HashSet<>();
        int i=0,j=0;
        int maxlen =0;
        while(i < s.length())
        {
            if(!m.contains(s.charAt(i)))
            {
                m.add(s.charAt(i));
                i++;
                maxlen = Math.max(maxlen,i-j);

            }
            else
            {
                m.remove(s.charAt(j));
                j++;
            }
        }
        return maxlen;
    }
}