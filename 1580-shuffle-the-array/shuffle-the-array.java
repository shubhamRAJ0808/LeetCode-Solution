class Solution {
    public int[] shuffle(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                list.add(arr[i]);
                list.add(arr[n+i]);
            }
            else{
                list.add(arr[i]);
                list.add(arr[n+i]);
            }
        }
        int[] brr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            brr[i] = list.get(i);
        }
        return brr;

    }
}