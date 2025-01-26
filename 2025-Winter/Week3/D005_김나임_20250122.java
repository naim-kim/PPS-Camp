import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<String> heard = new HashSet<>();
            for (int i = 0; i < N; i++) {
                heard.add(br.readLine());
            }

            Set<String> seen = new HashSet<>();
            for (int i = 0; i < M; i++) {
                seen.add(br.readLine());
            }

            List<String> result = findIntersectionAndSort(heard, seen);

            System.out.println(result.size());
            result.forEach(System.out::println);
        }
    }

    private static List<String> findIntersectionAndSort(Set<String> set1, Set<String> set2) {
        set1.retainAll(set2);
        List<String> sortedList = new ArrayList<>(set1);
        Collections.sort(sortedList);
        return sortedList;
    }
}