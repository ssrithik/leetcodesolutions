class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] c = stones.toCharArray();
        int count=0;
        int i;
        for(i=0;i<c.length;i++)
        {
            if(jewels.contains(String.valueOf(c[i]))){
                count++;
            }
        }
        return count;
    }
}