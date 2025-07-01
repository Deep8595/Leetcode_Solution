class NumArray {
    int sum;
    int nums[];
    public NumArray(int[] nums) {
        this.nums = nums;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
    }
    
    public void update(int index, int val) {
        sum = sum - nums[index] + val;
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int i = 0;
        int temp = sum;
        while( i < left ){
            temp = temp - nums[i];
            i++;
        }

        i = nums.length -1;
        while( i > right ){
            temp = temp - nums[i];
            i--;
        }
        return temp;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */