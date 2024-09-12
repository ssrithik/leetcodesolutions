class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high = height.length-1;
        int max=0;
        while(low <= high)
        {
            int height1 = Math.min(height[low],height[high]);
            int area = high-low;
            if((height1*area) > max)
            {
                  max = height1*area;
            }
            if(height[low] < height[high])
            {
                low++;
            } 
            else
            {
                high--;
            }
        }
        return max;
    }
}