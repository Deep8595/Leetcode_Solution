class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer , Integer> map = new HashMap<>();
        int step = 0; 
        for( int i = 0 ; i < arr.length ; i++ ){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int[] array = new int[map.size()];
        int index = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            array[index++] = entry.getValue();
        }
        // array[i] = { 2, 4, 3, 1 }
        Arrays.sort(array);
        // array[i] = { 1, 2, 3, 4 }
        int tar = arr.length / 2;
        int sum = 0; 
        for(int i = array.length -1 ; i >= 0 ; i-- ){
            sum += array[i];
            step++;
            if(sum >= tar) break;
        }
        return (step >= 1) ? step : 0;
    }
}