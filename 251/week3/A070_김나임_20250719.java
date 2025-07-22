
// https://www.acmicpc.net/problem/2164
import java.util.*;

public class a070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 버림
            queue.offer(queue.poll()); // 다음 카드 아래로
        }

        System.out.println(queue.peek());
        sc.close();
    }
}