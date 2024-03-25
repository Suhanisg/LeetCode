package main;

public class Jump {
    class Solution {
        public int jump(int[] nums) {
            int ans = 0;
            int ends = 0;
            int farthest = 0;
            for (int i = 0; i < nums.length - 1; ++i) {
                farthest = Math.max(farthest, i + nums[i]);
                if (farthest >= nums.length - 1) {
                    ++ans;
                    break;
                }
                if (i == ends) {
                    ++ans;
                    ends = farthest;
                }
            }
            return ans;
        }
    }
}
