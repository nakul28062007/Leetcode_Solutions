package leetcode.easy;

public class LC485_MaxConsecutiveOnes {
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max_count = 0;
            int[] hash_arr = new int[nums.length+1]; //nums.lengtth +1 to hangle single sixe array
            for(int i = 0 ; i<nums.length; i++){
                if(nums[i]==1){
                    System.out.println("i is: "+i);
                    max_count++;
                    System.out.println("max count"+max_count);
                }
                else {
                    System.out.println("i is: "+ i);
                    hash_arr[max_count]++;
                    max_count=0;
                }

            }
            hash_arr[max_count]++;
            for(int j = hash_arr.length-1 ; j>=0 ; j--){
                if(hash_arr[j]!=0) return j;
            }
            for(int j = hash_arr.length-1 ; j>=0 ; j--){
                System.out.println("j is: "+j);
                System.out.println("hasharr[j] is: "+hash_arr[j]);
            }
            return 0;

        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] nums = {1,0,1};
        System.out.println(obj.findMaxConsecutiveOnes(nums));
//        obj.findMaxConsecutiveOnes(nums);
         }
}
