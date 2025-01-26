import java.util.*;

public class Main {
    private static boolean[] visited;
    private static List<List<Integer>> graph;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int M = s.nextInt();

            initializeGraph(N);
            initializeEdges(s, M);

            int infectedCntr = dfs(1);
            System.out.println(infectedCntr - 1);
        }
    }

    private static void initializeGraph(int n) {
        graph = new ArrayList<>(n + 1);
        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    private static void initializeEdges(Scanner s, int m) {
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    }

    private static int dfs(int current) {
        visited[current] = true;
        int cntr = 1;
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                cntr += dfs(neighbor);
            }
        }
        return cntr;
    }
}