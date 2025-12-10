class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ; 
        int j = 1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        int n = i+1; //length of the unique array elements 
        int[] ans = new int[n];
        for(int k = 0 ; k<n ; k++){
            ans[k]=nums[k];
        }
        
        return n;
        
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = new int[5];
        nums[0]=1;
        nums[1]=1;
        nums[2]=2;
        nums[3]=2;
        nums[4]=3;
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
    }
}