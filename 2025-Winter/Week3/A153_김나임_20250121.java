import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] times = new int[N];

            for (int i = 0; i < N; i++) {
                times[i] = s.nextInt();
            }

            System.out.println(calculateTotalTime(times));
        }
    }

    private static int calculateTotalTime(int[] times) {
        Arrays.sort(times);

        int total = 0;
        int waitingTime = 0;

        for (int time : times) {
            waitingTime += time;
            total += waitingTime;
        }

        return total;
    }
}