package leetcode.easy;
import java.util.ArrayList;
import java.util.List;

public class LC119_PasclaTriangle_2{
    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            //int middle_element=0;//initilisation
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i <rowIndex+1; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        row.add(j, 1);
                        if(i==0){break;}
                    }
                    else if (j == i) {
                        row.add(j, 1);
                        break;
                    }
                    else if ((result.get(i - 1).size() >= j)) {
                        int middle_element = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                        row.add(j, middle_element);
                    }
                }
                result.add(i, row);
            }
            return result.get(rowIndex);
        }

        public static void main(String[] args) {
            Solution obj = new Solution();
            List<Integer> ans = obj.getRow(3);
            System.out.println(ans);

        }
    }
}
