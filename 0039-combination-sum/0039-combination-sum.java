class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        generate(0, candidates, new ArrayList(), ans, target);
        return ans;

    }

    void generate(int start, int[] nums, List<Integer> curr, List<List<Integer>> ans, int target) {

        if (target == 0) {
            ans.add(new ArrayList(curr));
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            generate(i, nums, curr, ans, target - nums[i]);
            curr.remove(curr.size() - 1);
        }
    }

}
