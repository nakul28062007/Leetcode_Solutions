package leetcode.easy;
import  java.util.HashSet;

public class LC217_ContainsDulplicate {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for(int val: nums){
                if(seen.contains(val)){
                    return true;
                }
                seen.add(val);
            }
            return false;
        }
    }

    static void main() {
        Solution obj = new Solution();
        int[] arr = {1,2,3,4};
        System.out.println("Ans: "+obj.containsDuplicate(arr));
    }
}
