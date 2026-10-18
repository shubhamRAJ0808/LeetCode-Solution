class Solution {
    public String reformat(String s) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        // letter and diggit seperation
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                digit.append(ch);
            }
            else{
                letter.append(ch);
            }
        }
        // agar gap 1 se jada hoga toh alternate possible nahi h
        if(Math.abs(letter.length()-digit.length())>1){
            return "";
        }
        // swap karo 
        if(letter.length()<digit.length()){
            StringBuilder temp = letter;
            letter = digit;
            digit = temp;
        }
        StringBuilder ans = new StringBuilder();
        // append the ans at alternate pos
        for (int i = 0; i < digit.length(); i++) {
            ans.append(letter.charAt(i));
            ans.append(digit.charAt(i));
        }

        if (letter.length() > digit.length()) {
            ans.append(letter.charAt(letter.length() - 1));
        }

        return ans.toString();
    
        
    }
}