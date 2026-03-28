package leetcode.easy;

public class LC66_PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            //Key: Travewrse from back
            for(int i = digits.length-1 ; i>=0 ; i--){
                if(digits[i]<9){
                    digits[i]++;
                    return digits;
                }
                digits[i]=0;
            }
            //for cases like 99 , 999 etc
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;


        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] input = new int[2];
        input[0]=9;
        input[1]=9;
//        input[2]=3;
//        input[3]=4;
        int[] ans = obj.plusOne(input);
        for(int element: ans){
            System.out.print(element + " ");
        }


    }
}