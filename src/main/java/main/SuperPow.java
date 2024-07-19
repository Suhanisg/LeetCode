package main;

public class SuperPow {
    class Solution {
        public static int superPow(int a, int[] b) {
            // Calculate a^b % 1337 using modular exponentiation
            int result = 1;
            for (int digit : b) {
                result = pow(result, 10) * pow(a, digit) % 1337;
            }
            return result;
        }

        // Function to perform modular exponentiation (a^b) % 1337
        public static int pow(int a, int b) {
            a %= 1337;
            int result = 1;
            for (int i = 0; i < b; i++) {
                result = (result * a) % 1337;
            }
            return result;
        }
    }
}
