class Solution {
    public int[] intersection(int[] arr, int[] brr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int ele : arr){
            set.add(ele);
        }
        for(int i=0;i<brr.length;i++){
            if(set.contains(brr[i])) ans.add(brr[i]);
        }
        int[] commAns = new int[ans.size()];
        int i=0;
        for(int num : ans){
            commAns[i] = num;
            i++;
        }
        return commAns;
       
        
    }
}