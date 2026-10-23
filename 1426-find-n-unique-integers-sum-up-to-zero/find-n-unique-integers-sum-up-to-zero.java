class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n%2 != 0){
            list.add(0);
            for(int i=1;i<=n/2;i++){
                list.add(-i);
            }
            for(int i=1;i<=n/2;i++){
                list.add(i);
            }
        }
        else{
            for(int i=1;i<=n/2;i++){
                list.add(-i);
            }
            for(int i=1;i<=n/2;i++){
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}