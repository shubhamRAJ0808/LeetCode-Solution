class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length/2;i++){
            ans.add(list1.get(i));
            ans.add(list2.get(i));
        }
        int[] brr = new int[arr.length];
        for(int i=0; i<brr.length;i++){
            brr[i] = ans.get(i);
        }
        return brr;
    }
}