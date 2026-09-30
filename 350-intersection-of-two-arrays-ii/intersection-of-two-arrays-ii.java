class Solution {
    public int[] intersect(int[] arr, int[] brr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int n = arr.length;
        int m = brr.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr[i] == brr[j]){
                list.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]<brr[j]) i++;
            else j++;
        }
        int[] ans = new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k] = list.get(k);
        }
        return ans;
        
        
        
    }
}