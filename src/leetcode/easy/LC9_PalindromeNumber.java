package leetcode.easy;

import leetcode.medium.LC7_ReverseInteger;

public class LC9_PalindromeNumber {
    static class Solution {
        public boolean isPalindrome(int x) {
            int digit=0;
            int rightHalf = 0;
            if(x<0 || (x%10==0 && x!=0)) return false;
            while(x>rightHalf){
                digit=x%10;
                x/=10;
                rightHalf=rightHalf*10+digit;
            }
            if(x==rightHalf) return true;
            else if (rightHalf>x) {
                rightHalf/=10;
                if (x==rightHalf) return true;
            }
            return false;
        }
    }
    static void main() {
        Solution obj = new Solution();
        System.out.println("Ans: "+obj.isPalindrome(10));
    }
}
