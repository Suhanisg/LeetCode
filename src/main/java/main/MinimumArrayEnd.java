package main;

public class MinimumArrayEnd {
    class Solution {
        public long minEnd(int n, int x) {
            long i = x;
            while (--n > 0)
                i = (i + 1) | x;
            return i;
        }
    }
}
