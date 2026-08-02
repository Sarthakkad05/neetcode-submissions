class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num: nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }    

        backtrack(nums.length, count, new ArrayList<>());

        return res;
    }

    private void backtrack(int n, Map<Integer, Integer> count, List<Integer> perm){

        if(perm.size() == n){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int key: count.keySet()){

            if(count.get(key) == 0)
                continue;

            perm.add(key);
            count.put(key, count.get(key) - 1);

            backtrack(n, count, perm);

            perm.remove(perm.size() - 1);
            count.put(key, count.get(key) + 1);
        }
    }
 
}