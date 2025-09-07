class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int len = 0;
        int maxlen = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            while(arr.contains(ch))
            {
                arr.remove(arr.get(0));
            }
            arr.add(ch);
            len = arr.size();
            if(len > maxlen)
            {
                maxlen = len;
            }
            
        }
        return maxlen;
    }
}