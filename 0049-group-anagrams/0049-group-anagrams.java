class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int i,j;
        HashMap<String,List<String>> hm = new HashMap<>();
        for(i=0;i<strs.length;i++)
        {
           String s = strs[i];
           char[] arr = s.toCharArray();
           Arrays.sort(arr);
           String t  = new String(arr);
           hm.computeIfAbsent(t, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hm.values());

    }
}