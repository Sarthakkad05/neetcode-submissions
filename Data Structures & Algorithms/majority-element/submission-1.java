class Solution {

    //Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
      
      int can = 0, c = 0;

      for(int num: nums){

        if(can == num){
            c++;
        }else if(c == 0){
            can = num;
            c++;
        }else{
            c--;
        }
      }

      return can;
    }
}