class Solution {
    public boolean isBalanced(TreeNode root) {
        int height = getHeight(root);
        return (height != -1);
    }
    public int getHeight( TreeNode root ){
        if(root == null){
            return 0;
        }
        //post order traversal

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if(left == -1 || right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
        }
        return 1+Math.max(left , right);
    }
}