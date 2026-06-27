class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    } 

    private void backtrack(int index, int[] nums, List<Integer> subsets){

        if(index == nums.length){
            ans.add(new ArrayList<>(subsets));
            return;
        }

        //include
        subsets.add(nums[index]);
        backtrack(index + 1, nums, subsets);

        //backtrack
        subsets.remove(subsets.size() - 1);

        //exclude
        backtrack(index + 1, nums, subsets);
    }
}
