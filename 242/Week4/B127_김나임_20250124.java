//https://www.acmicpc.net/problem/1874
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int curr = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();

            while (curr <= num) {
                stack.push(curr);
                result.append("+\n");
                curr++;
            }

            if (stack.peek() == num) {
                stack.pop();
                result.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
        s.close();
    }
}