class Solution {

    private boolean canSplit(int[] nums, int k, int largest){
        int subArray = 0;
        int currSum = 0;

        for(int n: nums){
            currSum += n;
            if(currSum > largest){
                subArray++;
                currSum = n;
            }
        }
        return subArray + 1 <= k;
    }
    public int splitArray(int[] nums, int k) {
        
        int left = 0;
        int right = 0;

        for(int num: nums){
            left = Math.max(left, num);
            right += num;
        }

        while(left < right){
            
            int mid = left + (right - left) / 2;

            if(canSplit(nums, k, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}




