package main;

public class CombinationSumIv {
    class Solution {
  /*       Tabulation Method
      --------------------------
      T = Target, N = nums.length
      Time complexity: O(TâN)
      Space complexity: O(T)
  */

        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target+1];
            dp[0] = 1;

            for(int currSum = 1; currSum < dp.length; currSum++){
                for(int no : nums){
                    if(currSum - no >= 0){
                        dp[currSum] += dp[currSum - no];
                    }
                }
            }
            return dp[target];
        }

    }

}
