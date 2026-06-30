package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LC202_HappyNumber {
    static class Solution {
        public boolean isHappy(int n) {
            Set<Integer> seen = new HashSet<>();
            int var = 0;
            boolean val = false;
            while(var!=1) {
                while (n > 0) {
                    var += (n % 10) * (n % 10);
                    n = n / 10;
                }
                if(seen.contains(var)){
                    val=false; //its A LOOP
                    break;
                }
                else {
                    seen.add(var);
                }
                if(var!=1){
                    n=var;
                    var=0;
                }
                else {
                    val=true;
                    break;
                }
            }
            return val;
        }
    }
    static void main() {
        Solution obj = new Solution();
        System.out.println("ans: "+obj.isHappy(19));

        }
    }
