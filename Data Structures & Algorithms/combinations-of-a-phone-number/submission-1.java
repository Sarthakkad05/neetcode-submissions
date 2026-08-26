class Solution {
    
    private static final String[] MAP = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    
    
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;

        backtrack(0, digits, ans, new StringBuilder());
        return ans;
    }

    private void backtrack(int index, String digits, List<String> ans, StringBuilder curr){

        if(index == digits.length()){
            ans.add(curr.toString());
            return;
        }

        String letters = MAP[digits.charAt(index) - '0'];

        for(char letter: letters.toCharArray()){
            curr.append(letter);
            backtrack(index + 1, digits, ans, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

}









