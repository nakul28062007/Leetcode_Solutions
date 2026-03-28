package leetcode.easy;

public class LC35_SearchInsertPosition {
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int length = nums.length;
            int element;
            for(int i = 0 ; i <length; i++){
                if(nums[i]>=target){
                    return i;
                }
            }
            return length; //if the target is bigger than all the elements
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] nums = new int[4];
        nums[0]=1;
        nums[1]=3;
        nums[2]=5;
        nums[3]=6;
        int ans = obj.searchInsert(nums,7);
        System.out.println("Answer is: "+ans);


    }
}
