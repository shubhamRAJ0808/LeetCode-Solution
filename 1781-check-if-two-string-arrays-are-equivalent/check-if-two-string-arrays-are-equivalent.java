class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String s : word1){
            sb.append(s);
        }
        StringBuilder tb = new StringBuilder();
        for(String s : word2){
            tb.append(s);
        }
        return sb.toString().equals(tb.toString());

        
    }
}