import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            SortedSet<Integer> uniqueNums = new TreeSet<>();

            while (n-- > 0) {
                uniqueNums.add(s.nextInt());
            }

            String result = String.join(" ", uniqueNums.stream()
                    .map(String::valueOf)
                    .toArray(String[]::new));

            System.out.println(result);
        }
    }
}