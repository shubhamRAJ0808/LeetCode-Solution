class Solution {
    public int minStartValue(int[] arr) {
        int prefixSum = 0;
        int minVal = 0;
       // ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            //list.add(prefixSum);
            minVal = Math.min(prefixSum,minVal);
        }
       // int minval = Collections.min(list);
        return 1-minVal;

    }
}