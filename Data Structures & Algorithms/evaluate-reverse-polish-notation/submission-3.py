class Solution:
    def calculate(self, num1: int, num2: int, operator: str) -> int:
            match operator:
                case "+":
                    return num1 + num2
                case "-":
                    return num1 - num2
                case "*":
                    return num1 * num2
                case "/":
                    return int(num1 / num2)
                case _:
                    raise ValueError(f"Unknown operator: {operator}")

    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            if token == "+" or token == "-" or token == "*" or token == "/" :
                opr2 = stack.pop()
                opr1 = stack.pop()

                result = self.calculate(opr1, opr2, token)
                stack.append(result)
            else:
                stack.append(int(token))

        return stack.pop()
        