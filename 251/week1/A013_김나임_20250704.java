
// https://leetcode.com/problems/single-number/description/
import java.util.*;

public class a013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter numbers (space-separated): ");
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        System.out.println(checkIfSingle(nums));
    }

    public static int checkIfSingle(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }
}