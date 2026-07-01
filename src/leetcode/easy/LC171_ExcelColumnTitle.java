package leetcode.easy;

public class LC171_ExcelColumnTitle {
    static class Solution {
        public int titleToNumber(String columnTitle) {
            int i =0;
            int l= columnTitle.length();
            double mul=0;
            int ans=0;
            String reverse = new StringBuilder(columnTitle).reverse().toString();
            while(i<l){
                mul = Math.pow(26,i);
                ans+= ((((int)reverse.charAt(i))-65)+1)*mul;
                i++;
            }
            return ans;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Answer: "+ obj.titleToNumber("ABB"));
    }
}
