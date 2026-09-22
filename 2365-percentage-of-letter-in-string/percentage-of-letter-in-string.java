class Solution {
    public int percentageLetter(String str, char letter) {
        int n = str.length();
        int count =0;
        for(int i=0;i<n;i++){
            
            if(str.charAt(i) == letter){
                count++;
            }
        }
        double percent = ((double) count/n) * 100;
        return (int) Math.floor(percent);
        
    }
}