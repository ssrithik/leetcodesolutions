class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>(); 
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int i;
        List<Integer> s = new ArrayList<>();
        while(top <=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
            {
                s.add(matrix[top][i]);
            }
            top++;
            for(i=top;i<=bottom;i++)
            {
                s.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom)
            {
                for(i=right;i>=left;i--)
                {
                    s.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right)
            {
                for(i=bottom;i>=top;i--)
                {
                    s.add(matrix[i][left]);
                }
                left++;
            }
        }
        return s;
    }
}