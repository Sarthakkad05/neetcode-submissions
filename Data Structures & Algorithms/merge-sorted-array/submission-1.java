class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       int mx = m - 1;
       int nx = n - 1;
       int r = m + n - 1;

       while(nx >= 0){
         if(mx >= 0 && nums1[mx] >= nums2[nx]){
            nums1[r] = nums1[mx];
            mx--;
         }else{
            nums1[r] = nums2[nx];
            nx--;
         }
         r--;
       }
    }
}