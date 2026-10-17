class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            if(a==b /*Math.abs(a-b)==0*/){
                sb.delete(i,i+2);
                i = Math.max(-1,i-2);
            }
        }
        return sb.toString();
    }
}