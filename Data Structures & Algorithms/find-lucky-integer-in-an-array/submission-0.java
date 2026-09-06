class Solution {
    public int findLucky(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        
        int result = -1;

        for(int num: map.keySet()){
            if(num == map.get(num)){
                result = Math.max(result, num);
            }
        }
        return result;
    }
}