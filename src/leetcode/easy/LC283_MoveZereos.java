package leetcode.easy;

public class LC283_MoveZereos {
    static class Solution {
        public void moveZeroes(int[] nums) {
           int pos = 0;
           for(int i = 0 ; i<nums.length; i++){
               if(nums[i]!=0){
                   nums[pos]=nums[i];
                   pos++;
               }
           }//all non zero numbers are filled in order.
            while(pos < nums.length){
                nums[pos]=0;
                pos++;
            }
            //to print
            for(int val: nums) System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] nums = {0};
             obj.moveZeroes(nums);
         }
}

