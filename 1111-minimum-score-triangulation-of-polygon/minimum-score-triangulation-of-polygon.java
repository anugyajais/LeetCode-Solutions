import java.util.Arrays;

class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        // dp[i][j] stores the minimum score to triangulate the polygon
        // formed by vertices values[i], values[i+1], ..., values[j].
        // This subpolygon effectively considers a chain of vertices from i to j.
        // The problem is about a convex polygon, so we can consider any edge (i, j)
        // as the base of a "virtual" polygon.
        int[][] dp = new int[n][n];

        // The length 'l' represents the number of vertices in the subpolygon.
        // A polygon must have at least 3 vertices to be triangulated.
        // So 'l' goes from 3 to n.
        for (int l = 3; l <= n; l++) {
            // 'i' is the starting vertex index of the current subpolygon.
            // 'j' is the ending vertex index of the current subpolygon.
            // j = i + l - 1.
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;

                // Initialize dp[i][j] with a very large value to find the minimum.
                dp[i][j] = Integer.MAX_VALUE;

                // 'k' is the third vertex of the base triangle (values[i], values[k], values[j]).
                // 'k' must be strictly between 'i' and 'j' (i < k < j).
                // This triangle (i, k, j) divides the polygon (i, ..., j) into:
                // 1. The triangle (i, k, j) itself.
                // 2. The subpolygon (i, ..., k), which needs to be triangulated (score dp[i][k]).
                // 3. The subpolygon (k, ..., j), which needs to be triangulated (score dp[k][j]).
                for (int k = i + 1; k < j; k++) {
                    int currentTriangleScore = values[i] * values[k] * values[j];

                    // Add scores from subproblems.
                    // If k = i + 1, dp[i][k] represents a polygon of length 2 (an edge),
                    // which has a triangulation score of 0 (already handled by default dp array initialization to 0).
                    // Similarly, if k = j - 1, dp[k][j] represents an edge, with a score of 0.
                    int totalScore = currentTriangleScore + dp[i][k] + dp[k][j];

                    dp[i][j] = Math.min(dp[i][j], totalScore);
                }
            }
        }

        // The result for the entire polygon is stored in dp[0][n-1].
        return dp[0][n - 1];
    }
}