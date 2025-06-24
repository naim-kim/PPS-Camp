//카드2
//https://www.acmicpc.net/problem/2164

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if (n < 1 || n > 500000)
        return;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
        s.close();
    }
}