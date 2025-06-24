import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int P = s.nextInt();

            for (int i = 0; i < P; i++) {
                int[] arr = new int[10];
                for (int j = 0; j < 10; j++) {
                    arr[j] = s.nextInt();
                }
                System.out.println(getThirdLargest(arr));
            }
        }
    }

    private static int getThirdLargest(int[] arr) {
        return Arrays.stream(arr)
                .sorted()
                .skip(7)
                .findFirst()
                .orElseThrow();
    }
}
