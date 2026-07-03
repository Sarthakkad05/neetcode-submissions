class Solution {
    //merge sort
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    private void divide(int[] nums, int left, int right){

        if(left >= right) return;

        int mid = left + (right - left) / 2;

        divide(nums, left, mid);
        divide(nums, mid+1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right){

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i <= mid){
            temp[k++] = nums[i++];
        }

        while(j <= right){
            temp[k++] = nums[j++];
        }

        for(int p = 0; p < temp.length; p++){
            nums[left+p] = temp[p];
        }
    }
}