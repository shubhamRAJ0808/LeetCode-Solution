class Solution {
    public int[] findIntersectionValues(int[] arr, int[] brr) {
        Arrays.sort(arr);
        Arrays.sort(brr);

        int n = arr.length;
        int m = brr.length;

        int count1 = 0;
        int count2 = 0;
        //count in arr
        for(int i=0;i<n;i++){
            if(binarySearch(brr, arr[i])){
                count1++;
            }
        }
        //count in brr
        for(int i=0;i<m;i++){
            if(binarySearch(arr, brr[i])){
                count2++;
            }
        


        }
        return new int[]{count1,count2};
    }


    public boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return true;
            else if( arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}