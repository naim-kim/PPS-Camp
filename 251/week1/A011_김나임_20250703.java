
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
import java.util.*;

public class a011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Number of stages: ");
        int N = sc.nextInt();

        // System.out.print("Enter stages (space-separated): ");
        sc.nextLine();
        int[] stages = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] result = getFailureRate(N, stages);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getFailureRate(int N, int[] stages) {
        int[] count = new int[N + 2]; // stage count
        for (int stage : stages)
            count[stage]++;

        int totalPlayers = stages.length;
        List<int[]> failureList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int current = count[i];
            double failRate = totalPlayers == 0 ? 0.0 : (double) current / totalPlayers;
            failureList.add(new int[] { i, (int) (failRate * 1e9) });
            totalPlayers -= current;
        }

        failureList.sort((a, b) -> b[1] == a[1] ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));
        return failureList.stream().mapToInt(a -> a[0]).toArray();
    }
}