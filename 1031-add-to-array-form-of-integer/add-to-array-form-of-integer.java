class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = arr.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k = k + arr[i];
                i--;
            }

            ans.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}