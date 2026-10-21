class Solution {
    public int findClosestNumber(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                int diff = arr[i]-0;
                list.add(diff);
            }
            else{
                int diff = 0-arr[i];
                list.add(diff);
            }
        }
        int min = Integer.MAX_VALUE;
        int ans =0;
        for(int i=0; i<list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
                ans = arr[i];
            }
            else if(list.get(i)==min && arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
        
    }
}