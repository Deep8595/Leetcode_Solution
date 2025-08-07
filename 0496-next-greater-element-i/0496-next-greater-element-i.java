class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        int[] answer = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length -1 ; i >= 0 ; i--){
            int el = nums2[i];
            if(stack.isEmpty()){
                stack.push(el);
                ans[i] = -1;
            }
            if(stack.peek() > el){
                ans[i] = stack.peek();
                stack.push(el);
            }
            while( !stack.isEmpty() && stack.peek() <= el){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(el);
        }
        int j = 0;
        for(int i = 0 ; i < ans.length; i++){
            if( j < nums1.length && nums2[i] == nums1[j]){
                answer[j] = ans[i];
                j++;
                i = -1;
            }
        }
        return answer;
    }
}