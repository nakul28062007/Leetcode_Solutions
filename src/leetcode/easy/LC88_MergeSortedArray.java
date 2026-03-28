package leetcode.easy;

public class LC88_MergeSortedArray {
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //key: traverse from end
            int i = m-1; // end valid element of nums1
            int j = n-1; //end element of nums2
            int k = m+n-1; //last index of nums1
            while(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                    i--;
                }
                else{
                    nums1[k]=nums2[j];
                    j--;
                }
                k--;
            }

            //edge case when all elememts in nums1 are 0 or are not valid
            while(j>=0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }

            //printing final nums1
            for(int element:nums1) System.out.print(element+" ");

        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] nums1=new int[3];
        nums1[0]=0;
        nums1[1]=0;
        nums1[2]=0;
        int m = 0;
        int[] nums2=new int[3];
        nums2[0]=2;
        nums2[1]=5;
        nums2[2]=6;
        int n = 3;
        obj.merge(nums1,m,nums2,n);





    }
}
