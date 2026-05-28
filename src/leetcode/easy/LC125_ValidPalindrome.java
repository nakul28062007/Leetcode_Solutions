package leetcode.easy;
public class LC125_ValidPalindrome {
    static class Solution {
        public boolean isPalindrome(String s) {
            s=s.toLowerCase();
            int p1=0;
            int p2=s.length()-1;
            boolean ans=true;
            while(p2>p1){
                if(!Character.isLetterOrDigit(s.charAt(p1))){
                    p1++;
                }
                else if(!Character.isLetterOrDigit(s.charAt(p2))){
                    p2--;
                }
                else if(s.charAt(p1)!=s.charAt(p2)){
                    ans=false;
                    break;
                }
                else{ //s.charAt(p1) is equal to s.charAt(p2) here
                    p1++;
                    p2--;
                }
            }
            return ans;
        }

        static void main() {
            Solution obj = new Solution();
            System.out.println("Answer: "+obj.isPalindrome("A man, a plan, a canal: Panama"));
        }
    }
}
