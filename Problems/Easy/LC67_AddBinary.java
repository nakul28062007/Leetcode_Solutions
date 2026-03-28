package leetcode.easy;

public class LC67_AddBinary {
    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int i = a.length()-1;
            int j = b.length()-1;
            int carry=0;
            int sum = carry;
            while(i>=0 || j>=0 || carry==1){
                int x = 0,y=0;
                if(i>=0){
                    x = a.charAt(i)-'0'; //ASCII of 1 is 49 , 0 is 48
                }
                if(j>=0){
                    y = b.charAt(j)-'0';
                }
                sum=x+y+carry;
                sb.append(sum%2);;//value
                carry = (x+y+carry)/2;//carry
                i--;
                j--;
            }
         return sb.reverse().toString();
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        String ans =obj.addBinary("11","1");
        System.out.println("Ans="+ans);

    }
}
