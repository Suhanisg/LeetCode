package main;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int num = nums.length;
            return nums[num/2];
        }
    }
}
