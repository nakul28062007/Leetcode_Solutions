package leetcode.easy;

public class LC112_PathSum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static TreeNode build(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right=build(nodes);
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

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root==null) return false;
            if(root.left==null && root.right==null){
                return root.val==targetSum;
            }
            return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        }

    }
    public static void main(String[] args){
        BinaryTree.idx=-1;
        int[] nodes={5,4,11,7,-1,-1,2,-1,-1,-1,8,13,-1,-1,4,-1,1,-1,-1};
        TreeNode root = BinaryTree.build(nodes);
        BinaryTree.preorder(root);
        Solution obj = new Solution();
        System.out.println();
        System.out.println("Does teh root to path equals target sum?="+obj.hasPathSum(root,27));
    }
}
