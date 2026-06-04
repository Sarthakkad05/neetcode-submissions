class Solution {
    public void backtrack(int[] nums, int target,int idx, List<Integer> curr, List<List<Integer>> result){
        //if target is 0
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        //base case
        if(target < 0 || idx == nums.length) return;

        //pick
        curr.add(nums[idx]);
        backtrack(nums, target - nums[idx], idx, curr, result);

        //backtrack
        curr.remove(curr.size() - 1);

        //skip
        backtrack(nums, target, idx+1, curr, result);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }
}
