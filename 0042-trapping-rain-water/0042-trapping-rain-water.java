class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        int i;
        for(i=1;i<n;i++)
        {
             left[i] = Math.max(left[i-1],height[i]);
        }
        for(i=n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],height[i]);
        }
        int rain=0;
        for(i=0;i<n;i++)
        {
            rain += Math.min(left[i],right[i])-height[i];
        }
        return rain;
    }
}