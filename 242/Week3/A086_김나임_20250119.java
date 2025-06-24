import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int m = s.nextInt();
            int n = s.nextInt();

            List<Integer> nums = new ArrayList<>();
            for (int i = m; i <= n; i++) {
                nums.add(i);
            }

            nums.sort(Comparator.comparingInt(a -> Integer.parseInt(Integer.toString(a))));

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < nums.size(); i++) {
                result.append(nums.get(i)).append(" ");
                if ((i + 1) % 10 == 0) {
                    result.append("\n");
                }
            }

            System.out.print(result.toString().trim());
        }
    }
}