package leetcode.easy;

import java.util.Arrays;

public class LC1752_CheckIfArrayIsSortedAndRotated {
    static class Solution {
        public boolean check(int[] nums) {
            int[] sorted = nums.clone();
            Arrays.sort(sorted);
            if(isEqual(sorted,nums)){ // x = 0 => no rotation
                return true;
            }
            for(int x = 1; x<nums.length ; x++){
                if(isEqual(rotateArray(sorted,x),nums)){
                    return true;
                }
            }
            return false;
        }
        private boolean isEqual(int [] arr1, int [] arr2){
            int l = arr1.length;
            for(int i = 0 ; i<l ; i++){
                if(arr1[i]!=arr2[i]) return false;
            }
            return true;
        }
        private int[] rotateArray(int[] sorted,int k){
            int l = sorted.length;
            int[] rotated = new int[l];
            for(int i = 0 ; i <l; i++){
                rotated[(i+k)%l]=sorted[i];
            }
            return rotated;
        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] nums = {3,4,5,1,2};
             System.out.println(obj.check(nums));
         }
}
