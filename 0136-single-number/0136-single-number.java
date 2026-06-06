class Solution {
    public int singleNumber(int[] nums) {
    int[] freq = new int[60001];

for(int num : nums) {
    freq[num + 30000]++;
}

for(int num : nums) {
    if(freq[num + 30000] == 1)
        return num;
}

return -1;
    
    }
}