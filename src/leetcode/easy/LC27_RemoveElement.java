package leetcode.easy;

public class LC27_RemoveElement {
    static class Solution{
        public int removeElememt(int[] nums , int val){
            int i=0;
            for(int j = 0 ; j<nums.length;j++){
                if(nums[j]==val) continue;
                if(nums[j]!=val){
                    nums[i]=nums[j];
                    i++;
                }
            }
            int k = i;
            return k;
        }

        static void main() {
            Solution obj = new Solution();
            int[] nums = new int[4];
            nums[0]=3;
            nums[1]=2;
            nums[2]=2;
            nums[3]=3;
            System.out.println("result = "+obj.removeElememt(nums,3));

        }
    }
}
