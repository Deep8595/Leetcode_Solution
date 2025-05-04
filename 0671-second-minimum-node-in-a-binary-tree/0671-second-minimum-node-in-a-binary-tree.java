class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(root,ans);

        int min = root.val;
        long secmin = Long.MAX_VALUE;

        for(int i = 0 ; i < ans.size() ; i++){
            int val = ans.get(i);
            if(val > min && val < secmin){
                secmin = val;
            }
        }
        return secmin == Long.MAX_VALUE ? -1 : (int) secmin;
    }
    private void traverse( TreeNode root , List<Integer> ans ){
        if( root == null ) return ;
        ans.add(root.val);
        traverse(root.left, ans);
        traverse(root.right, ans);
    }
}