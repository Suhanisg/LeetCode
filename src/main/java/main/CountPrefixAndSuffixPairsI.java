package main;

public class CountPrefixAndSuffixPairsI {
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {

            int count=0;
            for( int i=0;i<words.length;i++ ) {

                String str1= words[i];
                for( int j=i+1;j<words.length;j++ ) {

                    String str2= words[j];
                    boolean ch =true;
                    for( int k=0;k<Math.min(str1.length(),str2.length());k++ ) {

                        if( str1.length() > str2.length()) { ch=false;break;}
                        if( (str1.charAt(k) != str2.charAt(k)) || (str1.charAt(str1.length()-1-k) != str2.charAt(str2.length()-1-k))) { ch=false;break;}
                    }

                    if( ch)  count++;
                }
            }
            return count;
        }
    }
}
