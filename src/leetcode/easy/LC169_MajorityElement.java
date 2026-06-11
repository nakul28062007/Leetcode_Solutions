    package leetcode.easy;

    public class LC169_MajorityElement {
        static class Solution {
            public int majorityElement(int[] nums) {
                int count=0;
                int candidate=0;
                int i = 0;
                while(i<(nums.length)){
                    if(count==0){
                        candidate=nums[i];
                        count=1;
                    }
                    else if(nums[i]==candidate) {
                        count++;
                    }
                    else if (nums[i]!=candidate) {
                        count--;
                    }
                    i++;
                }
                return candidate;
            }
        }

        static void main() {
            Solution obj = new Solution();
            int[] arr = {3,3,4};
            System.out.println("Ans: "+obj.majorityElement(arr));
        }
    }
