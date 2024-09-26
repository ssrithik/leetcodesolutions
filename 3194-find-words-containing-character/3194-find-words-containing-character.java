class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> m = new ArrayList<>();
        int i,j;
        for(i=0;i<words.length;i++)
        {
            String s = words[i];
            for(j=0;j<s.length();j++)
            {
                if(s.charAt(j)== x)
                {
                    m.add(i);
                    break;
                }
            }
            
        }
        return m;
    }
}