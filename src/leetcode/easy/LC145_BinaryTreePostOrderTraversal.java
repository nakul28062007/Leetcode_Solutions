package leetcode.easy;
import java.util.ArrayList;
import java.util.List;

public class LC145_BinaryTreePostOrderTraversal {
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
        public List<Integer> postorderTraversal(Node root) {
            List<Integer> result = new ArrayList<>();
            if(root==null){
                return result;
            }
            result.addAll(postorderTraversal(root.left));
            result.addAll(postorderTraversal(root.right));
            result.add(root.val);
            return result;
        }
        public static void main(String[] args){
            int[] nodes={1,-1,2,3,-1,-1,-1};
            Solution obj = new Solution();
            Node root = BinaryTree.buildTree(nodes);
            System.out.println("Postorder traversal is: "+ obj.postorderTraversal(root));
        }
    }
}
