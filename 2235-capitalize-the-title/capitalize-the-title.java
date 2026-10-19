class Solution {
    public String capitalizeTitle(String s) {
        StringBuilder sb = new StringBuilder();
        String[] word = s.split(" ");
        for(int i=0;i<word.length;i++){
            String str = word[i];
            if(str.length()<=2){
                str = str.toLowerCase();
                sb.append(str);
            }
            else{
                str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
                sb.append(str);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}