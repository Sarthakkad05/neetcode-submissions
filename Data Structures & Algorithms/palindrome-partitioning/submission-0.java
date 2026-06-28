class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(0, s, new ArrayList<>());
        return ans;    
    }

    private void backtrack(int start, String s, List<String> curr){

        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return ;
        }

        for(int end = start; end < s.length(); end++){

            if(palindrome(s, start, end)){

                curr.add(s.substring(start, end + 1));

                backtrack(end + 1, s, curr);

                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean palindrome (String s, int start, int end){

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
