package leetcode.easy;

public class LC191_NumberOfBits {
    static class Solution {
        public int hammingWeight(int n) {
            int count=0;
            int bit;
            while(n!=0){
                bit = n&1;
                if(bit==1) count++;
                n = n>>>1;
            }
            return count;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Ans: "+obj.hammingWeight(2147483645));
    }
}
