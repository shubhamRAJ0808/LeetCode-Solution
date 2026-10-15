class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","").toUpperCase();
        
        StringBuilder sb = new StringBuilder();
        int first = s.length()%k;
        int i=0;
        if(first>0){
            sb.append(s.substring(0,first));
            i=first;
        }
        while(i<s.length()){
            if(sb.length()>0){
                sb.append('-');
            }
            sb.append(s.substring(i,i+k));
            i += k;
        }
        return sb.toString();
    }
}