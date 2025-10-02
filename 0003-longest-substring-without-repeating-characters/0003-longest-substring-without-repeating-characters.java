class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int i;
        int count = 0;
        for(i=0;i<s.length();i++)
        {
            char ch  = s.charAt(i);
            if(!arr.contains(ch))
            {
                arr.add(ch);
            }
           else
            {
    int idx = arr.indexOf(ch);  
    for (int j = 0; j <= idx; j++) {
        arr.remove(0);   
    }
    arr.add(ch);
             }
            if(arr.size() > count)
            {
                count = arr.size();
            }
        }
        if(arr.size() > count)
        {
             count = arr.size();
        }
        return count;
    }
}