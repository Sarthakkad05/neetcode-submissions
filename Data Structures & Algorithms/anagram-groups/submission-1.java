class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];

            for(char ch: str.toCharArray()){
                count[ch-'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int freq: count){
                key.append('#').append(freq);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
