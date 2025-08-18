class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i=0,j=height.length-1;
        while(i < j)
        {
            int val = Math.min(height[i],height[j]);
            int curr = val* (j-i);
            if(curr > area)
            {
                area = curr;
            } 
            if(height[i] < height[j])
            {
                i++;
            }
            else if(height[i] >= height[j])
            {
                j--;
            }
        }
        return area;
    }
}