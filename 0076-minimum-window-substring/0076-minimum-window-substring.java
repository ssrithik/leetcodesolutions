class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i;
        for(i=0;i<t.length();i++)
        {
           char ch = t.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int left=0,right=0,formed=0;
        int required = hm.size();
        Map<Character,Integer> ht = new HashMap<>();
        int[] ans = new int[]{-1,0,0};
        while(right < s.length())
        {
            char c = s.charAt(right);
            ht.put(c,ht.getOrDefault(c,0)+1);
            if(hm.containsKey(c) && hm.get(c).intValue() == ht.get(c).intValue())
            {
                formed++;
            }
            while(left <= right && formed==required)
            {
                c = s.charAt(left);
                if(ans[0]==-1 || right-left+1 < ans[0])
                {
                    ans[0] = right-left+1;
                    ans[1] = left;
                    ans[2] = right;
                }
                ht.put(c,ht.get(c)-1);
                if(hm.containsKey(c) && ht.get(c).intValue() < hm.get(c).intValue())
                {
                    formed--;
                }
                left++;
            }
            right++;
        }
       return ans[0]== -1 ? "" : s.substring(ans[1],ans[2]+1);
    }
}