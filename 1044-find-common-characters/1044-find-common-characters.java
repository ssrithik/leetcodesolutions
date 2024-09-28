class Solution {
    public List<String> commonChars(String[] words) {
       List<Map<Character, Integer>> freqList = new ArrayList<>();
        
        // Fill freqList with frequency maps for each word
        for (String word : words) {
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char ch : word.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
            freqList.add(freqMap);
        }
        
        // Initialize result list to store common characters
        List<String> result = new ArrayList<>();
        
        // Iterate through characters in the first word's frequency map
        for (char ch : freqList.get(0).keySet()) {
            int minFreq = freqList.get(0).get(ch);
            
            // Check the minimum frequency of the character in all the words
            for (int i = 1; i < freqList.size(); i++) {
                minFreq = Math.min(minFreq, freqList.get(i).getOrDefault(ch, 0));
            }
            
            // Add the character to the result list minFreq times
            for (int i = 0; i < minFreq; i++) {
                result.add(String.valueOf(ch));
            }
        }
        
        return result;
    }
}