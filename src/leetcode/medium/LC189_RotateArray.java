package leetcode.medium;

public class LC189_RotateArray {
    static class Solution {
        public void rotate(int[] nums, int k) {
            int[] rotated = new int[nums.length];
            for(int i = 0 ; i<nums.length ; i++){
                rotated[(i+k)%(nums.length)]=nums[i];
            }
            System.arraycopy(rotated,0,nums,0,nums.length);
            for(int val: rotated) System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] nums = {1,2,3,4,5,6,7};
             obj.rotate(nums,3);
         }
}
