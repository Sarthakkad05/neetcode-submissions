class Solution {
    //Boyer-Moore Voting algorithm
    public List<Integer> majorityElement(int[] nums) {
        
     int c1 = 0, c2 = 0;
     int can1 = 0, can2 = 0;
     int n = nums.length;

    for(int num: nums){

            if(num == can1){
                c1++;
            }else if(num == can2){
                c2++;
            }else if(c1 == 0){
                can1 = num;
                c1 = 1;
            }else if(c2 == 0){
                can2 = num;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }

    c1 = 0;
    c2 = 0;

    for(int num: nums){
        if(can1 == num) c1++;
        else if(can2 == num) c2++;
    }

    List<Integer> ans = new ArrayList<>();

    if(c1 > n/3) ans.add(can1);
    if(c2 > n/3) ans.add(can2);

    return ans;
    }
}