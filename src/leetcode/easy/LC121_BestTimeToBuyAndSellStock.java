package leetcode.easy;

public class LC121_BestTimeToBuyAndSellStock {
    static class Solution {
        public int maxProfit(int[] prices) {
            int p1=0,p2=1,max=0,diff;
            for(p1=0 ; p1<prices.length;){
                if(p2>prices.length-1){
                    break;
                }
                else if(prices[p1]==prices[p2]){p2++;}
                else if(prices[p2]<prices[p1]){
                    p1=p2;
                    p2++;
                }
                else if (prices[p2]>prices[p1]) {
                    diff=prices[p2]-prices[p1];
                    if(diff>max){max=diff;}
                    p2++;
                }
            }
            return max;
        }

        static void main() {
            Solution obj = new Solution();
            int[] arr = {1,1,5};
            int ans = obj.maxProfit(arr);
            System.out.println(ans);
        }
    }

}
