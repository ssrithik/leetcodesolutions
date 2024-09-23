import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        // Array to store the minimum number of perfect squares required to get the sum up to i
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with a large value
        dp[0] = 0; // Zero perfect squares are needed to sum up to 0
        
        ArrayList<Integer> s = new ArrayList<>(); 
        // Generate all perfect squares <= n
        for (int i = 1; i * i <= n; i++) {
            s.add(i * i);
        }
        
        // Dynamic programming to find the least number of perfect squares that sum up to n
        for (int i = 1; i <= n; i++) {
            for (int square : s) {
                if (i - square >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }
        
        // Return the result for n
        return dp[n];
    }

    // Helper method to check if a number is a perfect square
    public static boolean isPerfect(int num) {
        if (num < 0) {
            return false; 
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
