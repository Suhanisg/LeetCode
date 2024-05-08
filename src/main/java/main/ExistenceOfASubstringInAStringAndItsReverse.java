package main;

public class ExistenceOfASubstringInAStringAndItsReverse {
    class Solution {
        public boolean isSubstringPresent(String a) {
            String rev="";
            for(int i=a.length()-1;i>=0;i--)
                rev+=a.charAt(i);
            for(int i=0;i<rev.length()-1;i++){
                if(a.contains(rev.substring(i,i+2)))
                    return true;
            }
            return false;
        }
    }
}
