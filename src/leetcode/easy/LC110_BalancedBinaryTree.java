package leetcode.easy;

public class LC110_BalancedBinaryTree {
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
        public static TreeNode Build(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left=Build(nodes);
            newNode.right= Build(nodes);
            return newNode;
        }
        public static void preorder(TreeNode root) {
            if (root == null) {
                return ;
            }
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args){
        BinaryTree.idx=-1;
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,6,-1,-1,-1};
        TreeNode root = BinaryTree.Build(nodes);
        BinaryTree.preorder(root);
        System.out.println();
        Solution obj = new Solution();
        System.out.println("is the Tree Balanced? = "+ obj.isBalanced(root));
    }
    static class Solution{
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            boolean currentNode = Math.abs(height(root.left)-height(root.right)) <=1 ;
            return isBalanced(root.left) && isBalanced(root.right) && currentNode;
        }
        private int height(TreeNode node){
            if(node==null){
                return 0;
            }
            return 1+Math.max(height(node.left),height(node.right));
        }

    }
}
