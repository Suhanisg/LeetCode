package main;

public class HIndex {
    class Solution {
        public int hIndex(int[] citations) {
            int n = citations.length;
            int[] freq = new int[1001];
            int max = Integer.MIN_VALUE;
            for(int c : citations){

                freq[c]++;
                max=Math.max(c,max);
            }
            int count_citations = 0;
            int i = max;
            for(;i>=0;i--){
                count_citations+=freq[i];
                if(count_citations>=i)break;
            }
            return i;
        }
    }
}
