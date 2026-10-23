class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int i=0;
        int j=0;
        boolean flag = true;
        while(i<target.length && j<arr.length){
            if(target[i] != arr[j]){
                flag = false;
                break;
            }
            i++;
            j++;
        }
        return flag;
    }
}