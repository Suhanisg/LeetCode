package main;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int row = matrix.length;
            if(row == 0) return list;
            int c = matrix[0].length;

            int m = 0;
            int ri = c-1;
            int t= 0;
            int b = row-1;
            int d =0;

            while(m<=ri && t<=b){
                if(d==0){
                    for(int i=m; i<=ri; i++){
                        list.add(matrix[t][i]);
                    }
                    d=1; t++;
                }
                else if(d==1){
                    for(int i=t; i<=b; i++){
                        list.add(matrix[i][ri]);
                    }
                    d=2; ri--;
                }else if(d==2){
                    for(int i=ri; i>=m; i--){
                        list.add(matrix[b][i]);
                    }
                    d=3; b--;
                }else if(d==3){
                    for(int i=b; i>=t; i--){
                        list.add(matrix[i][m]);
                    }
                    d=0; m++;
                }
            }
            return list;
        }
    }

}
