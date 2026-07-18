package leetcode.easy;

import java.util.HashMap;

public class LC3005_CountElementsWithMaximumFrequency {
    static class Solution {
        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ;i<nums.length ; i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            int max = 0;
            for(int val: map.values()){
                if(val>max) max = val;
            }
            int sum = 0;
            for(int val: map.values()){
                if(val==max) sum+=max;
            }
            return sum;
        }
    }
    static void main() {
        Solution obj = new Solution();
        int[] nums = {1,2,3,4,5};
        System.out.println("ans="+obj. maxFrequencyElements(nums));
    }
}
