class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i;
        int ascii = (int) target;
        for(i=0;i<letters.length;i++)
        {
            char t = letters[i];
            int a  = (int) t;
            if(a > ascii)
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}