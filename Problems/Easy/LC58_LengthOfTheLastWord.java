package leetcode.easy;

public class LC58_LengthOfTheLastWord {
    static class Solution {
        public int lengthOfLastWord(String s) {
            //Key: traverse from the end
            int length=0;
            int i = s.length()-1;
            //to skip trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            //to count last word
            while(i>=0 && s.charAt(i)!=' '){
                length++;
                i--;
            }
            return length;
        }
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        int Ans = obj.lengthOfLastWord("luffy is still joyboy   ");
        System.out.println("Anser is: "+Ans);

}
}
