package main;

public class PowerOfTwo {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            for (int i = 0; i < 31; i++) {
                int answer = (int) Math.pow(2, i);
                if (answer == n) {
                    return true;
                }
            }
            return false;
        }
    }
}
