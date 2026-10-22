class Solution {
    public int findFinalValue(int[] arr, int original) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==original){
                original *= 2;
                continue;
            }
        }
        return original;
    }
}