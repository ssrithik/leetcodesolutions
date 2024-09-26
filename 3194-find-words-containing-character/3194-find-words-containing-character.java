class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> m = new ArrayList<>();
        int i;
        for(i=0;i<words.length;i++)
        {
            String s = words[i];
            if(s.contains(String.valueOf(x)))
            {
                m.add(i);
                continue;
            }
        }
        return m;
    }
}