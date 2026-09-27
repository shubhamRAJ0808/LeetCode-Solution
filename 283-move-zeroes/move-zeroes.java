class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        // non zero element
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }

        // add all the zero element;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = list.get(i);
        }
        
    }
}