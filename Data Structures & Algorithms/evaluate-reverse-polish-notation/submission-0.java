class Solution {

    private int calculate(int num1, int num2, String operator) {
    return switch (operator) {
        case "+" -> num1 + num2;
        case "-" -> num1 - num2;
        case "*" -> num1 * num2;
        case "/" -> num1 / num2;
        default -> throw new IllegalArgumentException("Unknown operator: " + operator);
    };
}

    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){

                int operand2 = stack.pop();
                int operand1 = stack.pop() ;

                int result = calculate(operand1, operand2, token);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
