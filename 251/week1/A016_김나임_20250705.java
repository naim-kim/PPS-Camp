
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
import java.util.*;

public class a016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter weights weights (space-separated): ");
        int[] weights = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // System.out.print("Enter boat weight limit: ");
        int limit = sc.nextInt();

        int result = getBoatNum(weights, limit);
        System.out.println(result);
    }

    public static int getBoatNum(int[] weights, int limit) {
        Arrays.sort(weights);
        int i = 0, j = weights.length - 1;
        int count = 0; // boat count

        while (i <= j) {
            if (weights[i] + weights[j] <= limit) {
                i++; // pair the lightest and heaviest
            }
            j--; // always move the heaviest
            count++;
        }

        return count;
    }
}