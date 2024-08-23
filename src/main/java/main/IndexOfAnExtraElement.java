package main;

public class IndexOfAnExtraElement {
    class Solution {
        public int findExtra(int n, int arr1[], int arr2[]) {
            // add code here.
            for(int i=0;i<arr1.length-1;i++){
                if(arr1[i] != arr2[i]) return i;
            }
            return arr1.length-1;

        }
    }
}
