class Solution {
    public int maxScore(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            for(int j=0; j<=i; j++){
                left.append(s.charAt(j));
            }
            int leftCount = 0;
            for(int k=0; k<left.length();k++){
                if(left.charAt(k)=='0'){
                    leftCount++;
                }
            }
            for(int j=i+1; j<s.length(); j++){
                right.append(s.charAt(j));
            }
            int rightCount = 0;
            for(int k=0; k<right.length();k++){
                if(right.charAt(k)=='1'){
                    rightCount++;
                }
            }
            int sum = leftCount + rightCount;
            list.add(sum);
        }
        int max =Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
        
    }
}