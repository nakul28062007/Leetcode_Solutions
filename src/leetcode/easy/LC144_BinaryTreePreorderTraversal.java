package leetcode.easy;
import java.util.ArrayList;
import java.util.List;
public class LC144_BinaryTreePreorderTraversal {
    static class Solution {
        static class Node{
            int val;
            Node left;
            Node right;
            Node(int val){
                this.val = val;
                this.left=null;
                this.right=null;
            }
        }
        class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int[] nodes){
                idx++;
               if(nodes[idx]==-1){
                   return null;
               }
               Node newNode = new Node(nodes[idx]);
               newNode.left=buildTree(nodes);
               newNode.right=buildTree(nodes);
               return newNode; //returns root of the tree
            }
        }
        public List<Integer> preorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
        }
        public static void main(String[] args){
            BinaryTree.idx=-1;
            int[] nodes={1,-1,2,3,-1,-1,-1};
            Node root = BinaryTree.buildTree(nodes);
            Solution obj = new Solution();
            System.out.println("Preorder traversal is: "+ obj.preorderTraversal(root));
        }
    }
}
