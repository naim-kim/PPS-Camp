//https://www.acmicpc.net/problem/1966
//Printer Queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cases = s.nextInt();

        for (int t = 0; t < cases; t++) {
            int n = s.nextInt();
            int m = s.nextInt();

            Queue<Document> queue = new LinkedList<>();
            int[] priorityCnt = new int[10];

            for (int i = 0; i < n; i++) {
                int priority = s.nextInt();
                queue.add(new Document(priority, i));
                priorityCnt[priority]++;
            }

            int cnt = 0;

            while (!queue.isEmpty()) {
                Document current = queue.peek();

                if (hasHigherPriority(current.priority, priorityCnt)) {
                    queue.add(queue.poll());
                } else {
                    cnt++;
                    priorityCnt[current.priority]--;
                    queue.poll();

                    if (current.index == m) {
                        System.out.println(cnt);
                        break;
                    }
                }
            }
        }

        s.close();
    }

    private static boolean hasHigherPriority(int currentPriority, int[] priorityCnt) {
        for (int i = currentPriority + 1; i <= 9; i++) {
            if (priorityCnt[i] > 0) {
                return true;
            }
        }
        return false;
    }

    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}