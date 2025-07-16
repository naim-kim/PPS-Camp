
// https://www.acmicpc.net/problem/10828
import java.util.*;

public class a053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        for (int i = 0; i < N; i++) {
            String[] cmd = sc.nextLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }
        System.out.print(sb); // 한 번에 출력
    }
}