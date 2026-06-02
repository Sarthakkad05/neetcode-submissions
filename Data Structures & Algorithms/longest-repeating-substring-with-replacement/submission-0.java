class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq = new int[26];
       int left = 0, maxLen = 0, result = 0;

       for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            freq[ch - 'A']++;
            maxLen = Math.max(maxLen, freq[ch - 'A']);

            int window = right - left + 1;

            if(window - maxLen > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
       }
       return result;
    }
}
