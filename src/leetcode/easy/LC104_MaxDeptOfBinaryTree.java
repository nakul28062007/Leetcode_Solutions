package leetcode.easy;

public class LC104_MaxDeptOfBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        static TreeNode BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
        static void preorder(TreeNode root){
            if(root==null){
                return ;
            }
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args){
        BinaryTree.idx = -1;
        int[] nodes = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        TreeNode root = BinaryTree.BuildTree(nodes);
        BinaryTree.preorder(root);
        System.out.println();
        Solution obj = new Solution();
        System.out.println("Max Depth of this Bianry Tree is: "+ obj.maxDepth(root));
    }
    static class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            return 1 +  Math.max(maxDepth(root.left),maxDepth(root.right));
        }
    }
}
