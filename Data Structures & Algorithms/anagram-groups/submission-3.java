class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){

            int[] freq = new int[26];

            for(char ch: s.toCharArray()){
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int f:freq){
                key.append('#').append(f);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
