import java.util.Scanner;
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int []l1;
        l1  = new int[nums.length];
        int frequency=0;
        int digit;
        int copy_digit;
        for( int i = 0 ; i< nums.length ; i++){
            digit = nums[i];
            for( int j = 0 ;  j< nums.length ; j++){
                copy_digit = nums[j];
                if(digit==copy_digit){
                    frequency++;
                }
                
            }
            if(frequency%k==0){
                l1[i]=digit;
            }
            frequency=0;
        }
        int sum=0;
        for( int m = 0 ; m<l1.length ; m++){
            sum+=l1[m];
        }
        return sum;  
    }
     public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENter the size: ");
        n = sc.nextInt();
        int []nums;
        nums = new int[n];
        int addElement;
        for(int a = 0 ; a < n ; a++){
            System.out.println("Enter elment: ");
            addElement=sc.nextInt();
            nums[a]=addElement;
        }

        System.out.println(obj.sumDivisibleByK(nums,2));
     }
}