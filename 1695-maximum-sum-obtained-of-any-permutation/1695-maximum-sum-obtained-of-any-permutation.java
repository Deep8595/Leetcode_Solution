class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);
        long ans = 0;
        int arr[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < requests.length; i++) {
            arr[requests[i][0]]++;
            index = requests[i][1];
            if (index + 1 < arr.length) {
                arr[index +1]--;
            }
        }

        for (int j = 1; j < arr.length; j++) {
            arr[j] += arr[j - 1];
        }

        Arrays.sort(arr);
        Arrays.sort(nums);

        long  mod = 1000000007;
        for (int k = 0; k < arr.length; k++) {
            ans = (ans + ((long) nums[k] * (long)arr[k])%mod)%mod;

        }
        return (int)ans;
    }
}