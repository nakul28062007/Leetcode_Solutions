package leetcode.easy;

public class LC69_SqrtOfx {
    static class Solution {
        public int mySqrt(int x) {
            if(x==0) return 0;
            //key: try the numbers from reverse order. for eg if you try to find the sqrt root of 49. initial guess should be 49
            long y=x;
            while(y*y>x){
                y=(y+(x/y))/2;
            }
            return (int)y;
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int ans = obj.mySqrt(49);
        System.out.println("Ans="+ans);
    }
}
