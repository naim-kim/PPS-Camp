import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        List<int[]> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            points.add(new int[] { x, y });
        }

        points.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        StringBuilder result = new StringBuilder();
        for (int[] point : points) {
            result.append(point[0]).append(" ").append(point[1]).append("\n");
        }
        System.out.print(result);
    }
}