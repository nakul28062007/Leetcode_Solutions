package leetcode.easy;

public class LC70_ClimbingStairs {
    static class Solution {
        public int climbStairs(int n) {
            //key: this is a Fibonacci series
            int n1=0;
            int n2=1;
            int n3=0;
            for(int i = 0; i<n ; i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            return n3;
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int ans=obj.climbStairs(5);
        System.out.println("Total No of ways: "+ans);
    }
}
