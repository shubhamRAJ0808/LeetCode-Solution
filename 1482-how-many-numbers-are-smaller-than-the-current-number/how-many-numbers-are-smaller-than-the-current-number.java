class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }

            ans.add(count);
        }

        int[] finalArr = ans.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        return finalArr;
    }
}