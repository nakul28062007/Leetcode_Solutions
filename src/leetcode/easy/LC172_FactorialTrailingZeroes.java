package leetcode.easy;

public class LC172_FactorialTrailingZeroes {
    static class Solution {
        public int trailingZeroes(int n) {
            int count=0;
            double power=1;
            double multiplier=0;
            while(true){
                multiplier=Math.pow(5,power);
                power++;
                if(n/multiplier<1){
                    break;
                }
                count+=n/multiplier;
            }
            return count;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Ans: "+ obj.trailingZeroes(5));
    }
}
