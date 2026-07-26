class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            int sum = 0;
            int firstElement;
            int secondElement;

            switch (token) {
                case "+":
                    firstElement  = stack.pop();
                    secondElement = stack.pop();

                    stack.push(secondElement + firstElement);
                    break;
                case "-":
                    firstElement  = stack.pop();
                    secondElement = stack.pop();

                    stack.push(secondElement - firstElement);
                    break;
                case "*":
                    firstElement  = stack.pop();
                    secondElement = stack.pop();

                    stack.push(secondElement * firstElement);
                    break;
                case "/":
                    firstElement  = stack.pop();
                    secondElement = stack.pop();

                    stack.push(secondElement / firstElement);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}