package leetcode.easy;
import java.util.HashMap;
public class LC219_ContainsDuplicate_2 {
    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int current = 0 ; current<nums.length; current++){
                if(map.containsKey(nums[current])){
                    int prev = map.get(nums[current]);//previous index
                    System.out.println("preb="+prev);
                    System.out.println("curr="+current);
                    if(Math.abs(current-prev)<=k){
                        return true;
                    }
                }
                map.put(nums[current],current);
            }
            return false;
        }
    }
    static void main() {
        Solution obj = new Solution();
        int[] arr = {1,2,3,1,2,3};
        System.out.println("Ans: "+obj.containsNearbyDuplicate(arr,2));
    }
}
