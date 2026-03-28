package leetcode.easy;

public class LC28_FindIndexOfTheFIrstOccurenceInAString {
    static class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length();
            int m = needle.length();
            if(m>n){
                return -1;
            }
            else{
                for(int i = 0 ; i<= n-m ;i++){
                    int j = 0 ;

                    while(j<m && haystack.charAt(i+j)==needle.charAt(j)){
                        j++;
                    }
                     if(j==m){
                         return i;
                     }
                }
            }

            //No match found
            return -1;
        }
    }
     public static void main(String[] args){
        Solution obj = new Solution();
        int ans = obj.strStr("sadbutsad","sad");
         System.out.println("Anser is: "+ans);
     }

}
