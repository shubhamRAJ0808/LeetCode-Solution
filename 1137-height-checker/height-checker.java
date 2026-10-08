class Solution {
    public int heightChecker(int[] arr) {
        int[] brr = arr.clone();
        Arrays.sort(brr);
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != brr[i]) count++;
        }
        return count++;
    }
}