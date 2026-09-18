class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int insertPos = 0;
        // yeh loop non zero ko front me le aayega
        for(int i=0; i<n;i++){
            if(arr[i] != 0){
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        // yeh loop baad me zero fill karega
        while(insertPos<n){
            arr[insertPos]=0;
            insertPos++;

        }
        
    }
}