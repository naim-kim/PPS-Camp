// https://leetcode.com/problems/remove-outermost-parentheses/

public class a055 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0)
                    sb.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0)
                    sb.append(c);
            }
        }

        return sb.toString();
    }
}