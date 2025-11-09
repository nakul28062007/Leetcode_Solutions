import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int romanToInt(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            list.add(ch);
        }
        int ans =0;
        class helper{
            Map<Character,Integer> map = new HashMap<>();
            helper(){
                map.put('M',1000);
                map.put('D',500);
                map.put('C',100);
                map.put('L',50);
                map.put('X',10);
                map.put('V',5);
                map.put('I',1);
                }
                
            int getValue(char element){
                return map.get(element);
                }
            }  
        helper h = new helper();
        for(int i = 0 ; i<list.size()  ; i++){
            int value = h.getValue(list.get(i));
            if(i+1<list.size() && h.getValue(list.get(i+1))>value){
                ans-=value;
            }
            else{
                ans+=value;
            }
        }
       return ans;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.romanToInt("MCMXCIV"));
    }
}