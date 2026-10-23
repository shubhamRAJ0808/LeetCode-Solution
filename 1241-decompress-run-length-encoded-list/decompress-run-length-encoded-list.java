class Solution {
    public int[] decompressRLElist(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                list.add(arr[i+1]);
                arr[i]--;
            }
            i++;
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}