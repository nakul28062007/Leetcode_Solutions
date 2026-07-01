package leetcode.easy;
import java.util.HashMap;

public class LC205_IsomorphicStrings {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> map = new HashMap<>();
            HashMap<Character,Character> reverse_map = new HashMap<>();
            char p1; //key
            char p2; // value
            for( int i = 0 ; i<s.length();i++ ){
                p1=s.charAt(i); //key
                p2=t.charAt(i); //value
                if(map.containsKey(p1) && map.get(p1)!=p2) return false;
                else if (reverse_map.containsKey(p2) && reverse_map.get(p2)!=p1) return false;
                map.put(p1,p2);
                reverse_map.put(p2,p1);
            }
            return true;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println("Ans: "+ obj.isIsomorphic("badc","baba"));
    }

}
