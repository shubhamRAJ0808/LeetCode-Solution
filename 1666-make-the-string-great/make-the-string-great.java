class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            if(Math.abs(a-b)==32){
                sb.delete(i,i+2);
                i = Math.max(-1,i-2);
            }

        }
        return sb.toString();
        
    }
}