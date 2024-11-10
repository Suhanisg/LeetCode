package main;

public class ValidMountainArray {
    class Solution {
        public boolean validMountainArray(int[] nums)
        {
            int n=nums.length;
            boolean flag;
            if(n<3){
                return false;
            }
            int i=0,j=0,t=0,lcount=0,rcount=0;
            for(i=0;i<n-1;i++)
            {
                if(nums[i]<nums[i+1]){
                    lcount++;
                }
                else{
                    t=i;
                    break;
                }
            }

            for(i=t;i<n-1;i++)
            {
                if(nums[i]>nums[i+1]){
                    rcount++;
                }
                else{
                    break;
                }
            }
            if(lcount==0){
                return false;
            }
            if(rcount==0){
                return false;
            }
            if(lcount+rcount!=n-1){
                flag=false;
            }
            else{
                flag=true;
            }
            return flag;
        }
    }

}
