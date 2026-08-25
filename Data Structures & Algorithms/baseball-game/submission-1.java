class Solution {
    public int calPoints(String[] operations) {
        
       Stack<Integer> st = new Stack<>();

       for(String s: operations){

            if(s.equals("+")){
                int op1 = st.pop();
                int op2 = st.peek();

                st.push(op1);
                st.push(op1 + op2);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(st.peek() * 2);
            }else{
                st.push(Integer.parseInt(s));
            }
       }

       int sum = 0;

       while(!st.isEmpty()){
        sum += st.pop();
       }
       return sum;
    }
}