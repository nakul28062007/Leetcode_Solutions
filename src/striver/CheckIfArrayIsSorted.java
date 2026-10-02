package striver;

public class CheckIfArrayIsSorted {
    static class Solution {
        public boolean isSorted(int[] arr) {
            for(int i =0 ; i<arr.length; i++){
                if(arr.length>1) {
                    if (i == arr.length - 1) {
                        if (arr[i] < arr[i - 1]) return false;
                    } else if (arr[i + 1] < arr[i]) return false;
                }
            }
            return true;

        }
    }
    public static void main(String[] args) {
             Solution obj = new Solution();
             int[] arr = {5};
        System.out.println(obj.isSorted(arr));
         }

}
