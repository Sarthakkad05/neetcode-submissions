class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){

            if(matrix[i][0] <= target && target <= matrix[i][n-1]){

                int left = 0;
                int right = n - 1;

                while(left <= right){
                    int mid = left + (right - left) / 2;

                    if(matrix[i][mid] == target) return true;
                    else if(matrix[i][mid] < target) left = mid + 1;
                    else right = mid - 1;
                }
            }
        }
        return false;
    }
}
