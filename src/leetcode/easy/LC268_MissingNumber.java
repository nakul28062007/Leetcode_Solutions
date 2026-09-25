package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class LC268_MissingNumber {
    static class Solution {
        public int missingNumber(int[] nums) {
            int n=0;
            int num = 1;
            for(int i = 0; i<nums.length; i++){
                n^=num;
                n^=nums[i];
                num++;
            }
            return n;
        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] nums= {3,0,1};
        System.out.println(obj.missingNumber(nums));
         }
}
