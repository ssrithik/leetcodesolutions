class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder t = new StringBuilder(word);
            t.reverse();
            sb.append(t.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}