class Solution {
    public boolean makesquare(int[] matchsticks) {
        
        int sum = 0;

        for(int stick: matchsticks){
            sum += stick;
        }

        if(sum % 2 != 0) return false;

        int target = sum / 4;

        Arrays.sort(matchsticks);
        reverse(matchsticks);

        int[] sides = new int[4];

        return backtrack(matchsticks, 0, sides, target);
    }

    private boolean backtrack(int[] matchsticks, int index, int[] sides, int target){

        if(index == matchsticks.length){
            return sides[0] == target &&
            sides[1] == target &&
            sides[2] == target &&
            sides[3] == target;
        }

        int stick = matchsticks[index];

        for(int i = 0; i < 4; i++){

            if(sides[i] + stick > target) continue;

            sides[i] += stick;

            if(backtrack(matchsticks, index + 1, sides, target)) return true;

            sides[i] -= stick;

            if(sides[i] == 0) break;
        }
        return false;
    }

    private void reverse(int[] matchsticks){

        int l = 0;
        int r = matchsticks.length - 1;
        
        while(l < r){
            int temp = matchsticks[l];
            matchsticks[l] = matchsticks[r];
            matchsticks[r] = temp;

            l++;
            r--;
        }
    }
}