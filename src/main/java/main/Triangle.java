package main;

public class Triangle {
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int m = triangle.size();
            int[] dp = new int[m + 1];

            for (int row = m- 1; row > -1; --row) {
                for (int col = 0; col < row + 1; ++col) {
                    dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
                }
            }
            return dp[0];
        }
    }
}
