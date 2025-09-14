class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] freq = new int[26];
            for(char ch : strs[i].toCharArray())
            {
                freq[ch - 'a']++;
            }
            String signature = Arrays.toString(freq);
            groups.computeIfAbsent(signature, k-> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(groups.values());
    }
}