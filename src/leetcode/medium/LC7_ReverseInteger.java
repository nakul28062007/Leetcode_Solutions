package leetcode.medium;

public class LC7_ReverseInteger {
     static class Solution {
        public int reverse(int x) {
            int result = 0;
            int digit=0;
            int n=x;
            if(x<0){
                n=-x;
            }
            while(n>0){
                digit=n%10;
                n/=10;
                if(result>(Integer.MAX_VALUE/10)) return 0;
                result=result*10+digit;
            }
            if(x<0){
                return (0-result);
            }
            return result;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Ans: "+obj.reverse(123));
    }
}
