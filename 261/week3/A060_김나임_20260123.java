import java.util.*;

class a060 {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int s : stack)
            sum += s;
        return sum;
    }
}