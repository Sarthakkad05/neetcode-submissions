class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();

        for(String s: operations){

            if(s.equals("+")){
                int operand1 = stack.pop();
                int operand2 = stack.peek();

                stack.push(operand1);
                stack.push(operand1 + operand2);
            }else if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                stack.push(stack.peek() * 2);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        return sum;
    }
}