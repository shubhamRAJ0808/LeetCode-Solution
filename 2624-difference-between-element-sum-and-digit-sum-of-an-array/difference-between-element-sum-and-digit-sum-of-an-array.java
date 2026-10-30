class Solution {
    public int differenceOfSum(int[] arr) {
       int sum =0;
       for(int i=0;i<arr.length;i++){
         sum += arr[i];
       }
       int finalDigitSum =0;
       for(int i=0;i<arr.length;i++){
        int digitSum = 0;
        while(arr[i]>0){
            int digit = arr[i]%10;
            digitSum += digit; 
            arr[i] /= 10;
        }
        finalDigitSum += digitSum;
       } 
       return Math.abs(sum-finalDigitSum);
    }
}