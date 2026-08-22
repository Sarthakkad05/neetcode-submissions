class Solution {
    public int mySqrt(int x) {
      
      int res = 0;
      int l = 0;
      int r = x;

      while(l <= r){

            int m = l + (r - l) / 2;

            long square = (long) m * m;

            if(square > x){
                r = m - 1;
            }else if(square < x){
                l = m + 1;
                res = m;
            }else{
                return m;
            }
      }
      return res;
    }
}