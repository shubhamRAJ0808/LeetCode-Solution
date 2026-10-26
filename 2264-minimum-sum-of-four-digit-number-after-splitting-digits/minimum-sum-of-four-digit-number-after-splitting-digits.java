class Solution {
    public int minimumSum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb  = new StringBuilder();
        sb.append(arr[0]);
        sb.append(arr[2]);
        StringBuilder tb = new StringBuilder();
        tb.append(arr[1]);
        tb.append(arr[3]);

        int digit1 = Integer.parseInt(sb.toString());
        int digit2 = Integer.parseInt(tb.toString());

        return digit1+digit2;
    }
}