class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n > 0)
        {
           int rem = n%10;
            p = p*rem;
            s = s+rem;
            n=n/10;
        }
        return p-s;
    }
}