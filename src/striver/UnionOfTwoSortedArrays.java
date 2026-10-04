package striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    static class Solution {
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            ArrayList<Integer> array = new ArrayList<>();
            int x=0,y=0; //two pointers
            while(true){
                if(x>=a.length && y>=b.length) break;
                if(x>=a.length){
                    addSliced(b,y,array);
                    return array;
                }
                if(y>=b.length){
                    addSliced(a,x,array);
                    return array;
                }
                if(a[x]==b[y]){
                   if (array.isEmpty() || array.getLast() != a[x]) {
                       array.add(a[x]);
                   }
                    x++;
                    y++;
                }
                else if(a[x]<b[y]){
                    if (array.isEmpty() || array.getLast() != a[x]) {
                        array.add(a[x]);
                    }
                    x++;
                }
                else if(b[y]<a[x]){
                    if (array.isEmpty() || array.getLast() != b[y]) {
                        array.add(b[y]);
                    }
                    y++;
                }
            }
            return array;
        }
        private static void addSliced(int[] arr, int val,ArrayList<Integer> array){
            int[] sliced = Arrays.copyOfRange(arr,val,arr.length);
            int i = 0;
            while(i<sliced.length){
                if (array.isEmpty() || array.getLast() != sliced[i]) {
                    array.add(sliced[i]);
                }
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3};
        Solution obj = new Solution();
        System.out.println(obj.findUnion(arr1,arr2));
         }

}
