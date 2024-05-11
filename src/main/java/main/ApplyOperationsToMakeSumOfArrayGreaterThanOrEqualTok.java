package main;

public class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok {
    class Solution {
        public int minOperations(int k) {
            int m = (int) Math.sqrt(k), n= (k+m-1)/m;
            return m + n - 2;
        }
    }
}
