package leetcode.easy;

public class LC136_SingleNumber {
    static class Solution {
        public int singleNumber(int[] nums) {
            int ans=0;
            for(var i : nums){
                ans^=i;
            }
            return ans;
        }

        static void main() {
            Solution obj = new Solution();
            int[] nums = {4,2,3,3,2,1,1};
            System.out.println("Single No is: "+obj.singleNumber(nums) );
        }
    }
}
