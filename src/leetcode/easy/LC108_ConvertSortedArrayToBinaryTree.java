package leetcode.easy;

public class LC108_ConvertSortedArrayToBinaryTree {
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
        public static void preorder(TreeNode root){
            if(root==null){
                return ;
            }
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return build(nums,0,nums.length-1);
        }
        private TreeNode build(int[] nums , int left , int right){
            if(left>right){
                return null;
            }
            int mid = (left+right)/2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left=build(nums,left,mid-1);
            root.right=build(nums,mid+1,right);
            return root;
        }
    }
    public static void main(String[] args){
        int[] nums={-10,-3,0,5,9};
        Solution obj = new Solution();
        TreeNode root = obj.sortedArrayToBST(nums);
        BinaryTree.preorder(root);
    }
}
