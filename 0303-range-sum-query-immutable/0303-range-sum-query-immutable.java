class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n+1];
        arr[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            arr[i] = arr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return arr[right];
        }else{
            return arr[right] - arr[left-1];
        }
    }
}