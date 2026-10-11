class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            boolean consistent = true;
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);

                if (!set.contains(ch)) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}
