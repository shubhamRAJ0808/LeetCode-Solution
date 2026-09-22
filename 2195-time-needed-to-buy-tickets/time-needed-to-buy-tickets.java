class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<arr.length;i++){
            q.add(i);
        }
        int n = q.size();
        int count =0;
        while(q.size()>0){
           int idx = q.remove(); // pahle element ko nikala
           arr[idx]--; // usko reduce kar diye
           count++;
           if(idx == k && arr[idx]==0) return count++;
           if(arr[idx]>0) q.add(idx);

        }
        return count;
        
    }
}