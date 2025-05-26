class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int r = 0;
        int z = x;
        while(z > 0)
        {
            int rem = z%10;
            r = r*10 + rem;
            z = z/10;
        }
        if(r == x)
        {
            return true;
        }
        return false;
    }

}