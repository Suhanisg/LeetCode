package main;

public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int a = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] != 0) {
                    int temp = nums[right];
                    nums[right] = nums[a];
                    nums[a] = temp;
                    a++;
                }
            }
        }
    }
}
