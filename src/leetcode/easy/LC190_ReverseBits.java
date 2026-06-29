package leetcode.easy;

public class LC190_ReverseBits {
    static class Solution {
        public int reverseBits(int n) {
            int ans = 0;
            int i=32;
            int bit;
            while(i>0){
                bit = n&1;
                ans = ans<<1; // shifting left
                ans = ans | bit;
                n=n>>>1; //shifting right.
                i--;
            }
            return ans;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println(obj.reverseBits(4));
    }
}

