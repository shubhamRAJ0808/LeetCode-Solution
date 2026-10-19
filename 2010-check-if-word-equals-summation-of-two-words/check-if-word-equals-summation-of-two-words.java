class Solution {
    public boolean isSumEqual(String f, String s, String tar) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<f.length();i++){
            int digit = f.charAt(i)-'a';
            sb.append(digit);
        }
        int FirstNum = Integer.parseInt(sb.toString());

        StringBuilder tb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i)-'a';
            tb.append(digit);
        }
        int SecondNum = Integer.parseInt(tb.toString());

        StringBuilder ta = new StringBuilder();
        for(int i=0;i<tar.length();i++){
            int digit = tar.charAt(i)-'a';
            ta.append(digit);
        }
        int target = Integer.parseInt(ta.toString());

        if(FirstNum + SecondNum == target) return true;
        return false;
    }
}