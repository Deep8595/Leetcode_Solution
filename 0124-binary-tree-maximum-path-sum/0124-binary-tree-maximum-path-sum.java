class Solution {
    public int maxPathSum(TreeNode root) {
        int[] arr = {Integer.MIN_VALUE};
        maxPath( root , arr );
        return arr[0];
    }
    public int maxPath(TreeNode root , int[] arr){
        if(root == null ) return 0;

        int left = Math.max(0 , maxPath(root.left , arr ));
        int right = Math.max(0 , maxPath(root.right , arr));
        arr[0] = Math.max(arr[0] , root.val + left + right);

        return root.val + Math.max(left , right);
    }
}