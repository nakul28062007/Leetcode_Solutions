package striver;

public class SecondLargestElement {
    static class Solution {
        public int getSecondLargest(int[] arr) {
            int max = Integer.MIN_VALUE;
            int max2 =  Integer.MIN_VALUE;
            for(int i = 0 ; i<arr.length; i++){
                if(arr[i]>max){
                    max2=max;
                    max =arr[i];
                }
                else if(arr[i] < max && arr[i]>max2){
                    max2=arr[i];
                }
            }
            if(max2==max) return -1;
            if(max2==Integer.MIN_VALUE) return -1;
            return max2;
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums={10,10,10};
        System.out.println("Second largest: "+ obj.getSecondLargest(nums));

         }
}
