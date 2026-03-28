package leetcode.easy;

public class LC3827_CountMonobitIntegers {
    /*static class Solution {
        public int countMonobit(int n) {
            int count=0;
            char constant=0;
            for(int i = 0 ; i<=n ; i++){
                boolean val = true;
                String binary = Integer.toBinaryString(i);
                if(binary.charAt(0)=='1'){
                    constant = '1';
                }
                else if(binary.charAt(0)=='0'){
                    constant = '0';
                }
                for(int j = 0 ; j<binary.length();j++){
                    char c=binary.charAt(j);
                    if(c!=constant) {
                        val=false;
                        break;
                    }
                }
                if(val==true) count++;

            }
            return count;

        }*/
    static class Solution_2{
        public int countMonobit(int n){
            int count=0;
            for(int i = 0 ; i<=n;i++){
                if((i&(i+1))==0){
                    count++;
                }
            }
            return count;
        }


    }
    public static void main(String[] args){
        Solution_2 obj = new Solution_2();
        int ans=obj.countMonobit(7);
        System.out.println("Answer="+ans);
    }
}
