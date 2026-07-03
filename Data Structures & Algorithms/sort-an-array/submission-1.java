class Solution {
    //selection sort
    public int[] sortArray(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            for(int j = i+1; j < n; j++){

                if(nums[j] < nums[minIndex]){
                  minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    return nums;
    }
}