class Solution {
    public int findNumbers(int[] arr) {
        int count =0;
        for(int i=0; i<arr.length;i++){
            int newCount = 0;
            while(arr[i]>0){
                int digit = arr[i]%10;
                newCount++;
                arr[i] /= 10; 
                
            }
            if(newCount%2==0){
                count++;
            }
        }
        return count;    
    }
}