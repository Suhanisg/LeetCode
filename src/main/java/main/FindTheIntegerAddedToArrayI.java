package main;

public class FindTheIntegerAddedToArrayI {
    class Solution {
        public int addedInteger(int[] nums1, int[] nums2) {
            int s = 0, sum2 = 0;
            for (int num : nums1) {
                s += num;
            }
            for (int num : nums2) {
                sum2 += num;
            }
            return (sum2 - s) / nums1.length;
        }
    }
}
