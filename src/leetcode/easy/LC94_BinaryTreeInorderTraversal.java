package leetcode.easy;
import java.util.List;
import java.util.ArrayList;

public class LC94_BinaryTreeInorderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            left = null;
            right=null;
        }
    }
    static class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            if(root==null){
                return null;
            }
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            return list;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static TreeNode buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static void main() {
        int nodes[] = {1,-1,2,3,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        Solution obj = new Solution();
        System.out.println(obj.inorderTraversal(root));

    }
}
