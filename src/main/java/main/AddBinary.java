package main;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            int len1 = a.length();
            int len2 = b.length();

            int minLen = Math.min(len1, len2);
            int maxLen = Math.max(len1, len2);

            int index1 = len1 - 1;
            int index2 = len2 - 1;

            StringBuilder bld = new StringBuilder();
            boolean carry = false;

            while((index1 >= 0) || (index2 >= 0) || carry) {
                char c1 = (index1 >= 0) ? a.charAt(index1) : '0';
                char c2 = (index2 >= 0) ? b.charAt(index2) : '0';

                char sum;
                if((c1 == '0') && (c2 == '0')) {
                    sum = carry ? '1' : '0';
                    carry = false;
                }
                else if((c1 == '1') && (c2 == '1')) {
                    sum = carry ? '1' : '0';
                    carry = true;
                }
                else {
                    sum = carry ? '0' : '1';
                }
                bld.append(sum);

                index1--;
                index2--;
            }
            return bld.reverse().toString();
        }
    }

}
