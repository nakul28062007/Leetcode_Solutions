package leetcode.easy;

public class LC168_ExcelSheetColoumnTitle {
    static class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while(columnNumber>0){
                columnNumber--;
                sb.append((char)(columnNumber%26+'A'));
                columnNumber=columnNumber/26;
            }
            return sb.reverse().toString();
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Answer: "+obj.convertToTitle(2147483647));
    }
}
