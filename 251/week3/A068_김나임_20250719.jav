// https://www.acmicpc.net/problem/18258
import java.io.*;
import java.util.*;

public class a068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    queue.offer(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : ((ArrayDeque<Integer>) queue).peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}