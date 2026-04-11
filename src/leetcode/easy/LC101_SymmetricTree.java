package leetcode.easy;

public class LC101_SymmetricTree {
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
            if(nodes[idx]==-1) return null;
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
        static void preOrder(TreeNode root){
            if(root==null){
                return ;
            }
            System.out.println(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static class Solution {
        public boolean isSymmetric(TreeNode root) {
                return isMirror(root.left , root.right);
        }
        boolean isMirror(TreeNode left , TreeNode right){
            if(left==null && right==null){
                return true;}
            if(left==null || right==null){
                return false;
            }
            if(left.val==right.val){
                return isMirror(left.left,right.right) && isMirror(left.right , right.left);
            }
            return false;
        }

    }

    public static void main(String[] args){
        int[] nodes={1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,5,-1,-1};
        BinaryTree.idx=-1;
        TreeNode root = BinaryTree.BuildTree(nodes);
        BinaryTree.preOrder(root);
        Solution obj = new Solution();
        System.out.println("Are the trees equal="+ obj.isSymmetric(root));
    }
}



