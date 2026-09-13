package leetcode.medium;

import java.util.HashMap;

public class LC325_MaximumSizeSubarraySumEqualsK {
    static class Solution{
        public int maxSubArrayLen(int[] nums, int k)    {
            HashMap<Integer,Integer> map = new HashMap<>();//prefix sum and its occurred index.
            map.put(0,-1); //for testcase {5,10} and k = 15
            int prefix_sum=0;
            int index;
            int ans=0;
            for(int i = 0 ; i <nums.length ; i++){
                index=0;
                prefix_sum+=nums[i];
                int target = prefix_sum-k;
                if(map.containsKey(target)){
                    index = map.get(target);
                    int curr_ans =i-index;
                    if(curr_ans>ans) ans = curr_ans;
                }
                if(!map.containsKey(prefix_sum)) map.put(prefix_sum, i);
            }
            return ans;
        }
        public static void main(String[] args) {
                 Solution obj = new Solution();
                 int[] nums = {10,5,2,7,1,9};
            System.out.println("length of longest subArray whose sum is K: "+obj.maxSubArrayLen(nums,15));

             }
    }
}
