package leetcode.easy;

public class LC100_SameTree {
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
    static class Binarytree{
        static int idx=-1;
        public static TreeNode buildTree(int[] nodes) {
            idx++;
            if(nodes[idx]==-1) return null;
            TreeNode node = new TreeNode(nodes[idx]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
        public static void preorder(TreeNode root){
            if(root == null){
                return ;
            }
            System.out.println(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args){
        Binarytree tree = new Binarytree();
        int[] nodes = {1,2,-1,-1,3,-1,-1};
        int[] nodes_2 = {1,2,-1,-1,3,-1,-1};
        int idx = -1;
        TreeNode root = tree.buildTree(nodes);
        tree.idx =-1; //resetting idx value
        TreeNode root_2 = tree.buildTree(nodes_2);//Tree 2
        System.out.println("Binary Tree 1: ");
        tree.preorder(root);//printing Tree 1
        System.out.println("Binary Tree 2 :");
        tree.preorder(root_2);//printing tree 2

        boolean ans = Solution.isSameTree(root,root_2);
        System.out.println("Are Both Trees Same? =" +ans);
    }
    static class Solution {
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;
            if(p.val!=q.val) return false;
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }

}

