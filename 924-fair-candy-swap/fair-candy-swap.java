class Solution {
    public int[] fairCandySwap(int[] arr, int[] brr) {
        int sumA = 0;
        for(int i=0;i<arr.length;i++){
            sumA += arr[i]; 
        }
        int sumB = 0;
        for(int i=0;i<brr.length;i++){
            sumB += brr[i]; 
        }
        int diff = (sumA-sumB)/2;
        HashSet<Integer> set = new HashSet<>();
        for(int b: brr){
            set.add(b);
        }
        for(int a:arr){
            int target = a-diff;
            if(set.contains(target)){
                return new int[]{a,target};
                
            }
        }
        return new int[]{0};
    }
}