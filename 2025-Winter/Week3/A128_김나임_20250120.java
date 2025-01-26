import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String line;
            while (!(line = s.nextLine().trim()).equals(".")) {
                System.out.println(isBalanced(line) ? "yes" : "no");
            }
        }
    }

    private static boolean isBalanced(String line) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : line.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}