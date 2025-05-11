class Solution {
    public boolean isValidBST(TreeNode root) {
        return findValid(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
    public boolean findValid(TreeNode root, long min , long max){
        if( root == null ){
            return true;
        }
        if( min >= root.val || max <= root.val){
            return false;
        }
        return findValid(root.left,min,root.val) && findValid(root.right,root.val,max);
    }
}