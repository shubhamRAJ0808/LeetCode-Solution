class Solution {
    public int[] sortArrayByParity(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        int[] brr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            brr[i] = list.get(i);
        }
        return brr;
        
    }
}