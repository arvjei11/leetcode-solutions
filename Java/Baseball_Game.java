class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String s: ops) {
            if (s.equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            } else if (s.equals("C")) {
                sum -= stack.pop();
            } else if (s.equals("+")) {
                int sec = stack.peek();
                stack.pop();
                int fir = stack.peek();
                int cur = fir + sec;
                stack.push(sec);
                stack.push(cur);
                sum += cur;
            } else {
                stack.push(Integer.parseInt(s));
                sum += stack.peek();
            }
        }
        return sum;
    }
}