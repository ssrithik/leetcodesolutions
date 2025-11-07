class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int result = 0;
        if(x < 0)
        {
            return false;
        }
        while(n != 0)
        {
            int rem = n%10;
            result = (result*10) + rem;
            n = n/10;
        }
        if(result == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}