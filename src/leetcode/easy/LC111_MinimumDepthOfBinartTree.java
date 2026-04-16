package leetcode.easy;

public class LC111_MinimumDepthOfBinartTree {
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
        static int idx=-1;
        public static TreeNode buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorder(TreeNode root){
            if(root==null){
                return;
            }
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static class Solution{
        public int minDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return 1;
            }
            if(root.left==null){
                return 1 + minDepth(root.right);
            }
            if(root.right==null){
                return 1+minDepth(root.left);
            }
            return 1+ Math.min(minDepth(root.left),minDepth(root.right));
        }

    }
    public static void main(String[] args){
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        //BinaryTree.idx=-1;
        TreeNode root= BinaryTree.buildTree(nodes);
        BinaryTree.preorder(root);
        Solution obj = new Solution();
        int ans = obj.minDepth(root);
        System.out.println();
        System.out.println("Min Depth="+ans);
    }

}
