class Solution {
    public int dominantIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max >= 2*arr[i] || max == arr[i]) list.add(arr[i]);
        }
        if(arr.length != list.size()) return -1;
        return idx;
        
    }
}