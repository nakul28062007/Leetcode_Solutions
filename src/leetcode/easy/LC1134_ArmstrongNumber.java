package leetcode.easy;

import java.util.ArrayList;

public class LC1134_ArmstrongNumber {
    static class Solution{
        public static boolean isArmstrong(int val){
            ArrayList<Integer> list = new ArrayList<>();
            int l=0,copy=val,sum=0;
            while(copy>0){
                l++;
                list.add(copy%10);
                copy/=10;
            }
            for(int i = 0 ; i<l ; i++){
               sum+=Math.powExact(list.get(i),l);
            }
            if (sum==val) return true;
            return false;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("ans="+obj.isArmstrong(153));
    }
}
