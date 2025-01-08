//요세푸스 문제 0
//https://www.acmicpc.net/problem/11866

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder result = new StringBuilder("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result);
        s.close();
    }
}