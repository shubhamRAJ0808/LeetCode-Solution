class Solution {
    public int countSeniors(String[] str) {
        int count = 0;
        for(String word : str){
            String s = ""+word.charAt(11) + word.charAt(12);
            int age = Integer.parseInt(s);
            if(age>60){
                count++;
            }
            
        }
        return count;
    }
}