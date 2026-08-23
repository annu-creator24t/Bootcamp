class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String op : operations) {
            switch (op) {
                case "+":
                    int a = stack.pop();
                    int b = stack.peek();
                    stack.push(a);
                    stack.push(a + b);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int x : stack) sum += x;
        return sum;
    }
}
