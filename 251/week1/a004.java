import java.util.*;

public class a004 {
    public static void main(String[] args) {
        new a004().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array (space-separated): ");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = filterDivisible(arr, divisor);
        System.out.println("Output = " + Arrays.toString(result));
    }

    // Returns sorted values from arr that are divisible by divisor,
    // or [-1] if none found
    private int[] filterDivisible(int[] arr, int divisor) {
        int[] filtered = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();

        return filtered.length == 0 ? new int[] { -1 } : filtered;
    }
}