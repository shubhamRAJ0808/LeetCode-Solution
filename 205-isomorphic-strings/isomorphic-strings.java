class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];
        int[] brr = new int[256];

        for(int i=0;i<s.length();i++){
            char sh = s.charAt(i);
            char th = t.charAt(i);
            if(arr[sh] !=brr[th]){
                return false;
            }
            arr[sh] = i+1;;
            brr[th] = i+1;;
        }
        return true;
    }
}