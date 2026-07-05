class Solution {
    public String mergeAlternately(String word1, String word2) {

        int w1 = word1.length();
        int w2 = word2.length();

        StringBuilder result = new StringBuilder();

        int s1 = 0;
        int s2 = 0;

        while(s1 < w1 && s2 < w2){
            result.append(word1.charAt(s1));
            result.append(word2.charAt(s2));
            s1++;
            s2++;
        }

        while(s1 < w1){
            result.append(word1.charAt(s1));
            s1++;
        }

        while(s2 < w2){
            result.append(word2.charAt(s2));
            s2++;
        }

        return result.toString();
    }
}