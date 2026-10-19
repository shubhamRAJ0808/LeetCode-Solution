class Solution {
    public boolean areNumbersAscending(String s) {
        String[] word = s.split(" ");
        int prev = -1;
        for(int i=0;i<word.length;i++){
            if(Character.isDigit(word[i].charAt(0))){
                int num = Integer.parseInt(word[i]);

                if(num <=prev){
                    return false;
                }
                prev = num;
            }
            
            
        }
        return true;
    }
}