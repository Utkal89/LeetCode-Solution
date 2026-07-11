class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Edge cases based on mathematical constraints
        if (totalSum < Math.abs(target) || (totalSum + target) % 2 != 0) {
            return 0;
        }

        int subsetTarget = (totalSum + target) / 2;
        return countSubsets(nums, subsetTarget);
    }

    private int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: 1 way to make a sum of 0 (using an empty set)

        for (int num : nums) {
            // Traverse backwards to avoid using the same element multiple times
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];
    }
}
