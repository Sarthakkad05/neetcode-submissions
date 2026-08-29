class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       
       Stack<Integer> st = new Stack<>();
       int n = temperatures.length;

       int[] ans = new int[n];

       for(int i = 0; i < temperatures.length; i++){

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }

            st.push(i);
       }
       return ans;
    }
}
