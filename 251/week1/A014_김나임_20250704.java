
// https://leetcode.com/problems/summary-ranges/description/
import java.util.*;

public class a014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter sorted numbers (space-separated): ");
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        List<String> result = getRanges(nums);
        System.out.println(result);
    }

    public static List<String> getRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0)
            return res;

        int start = nums[0], end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                res.add(start == end ? String.valueOf(start) : start + "->" + end);
                start = end = nums[i];
            }
        }
        res.add(start == end ? String.valueOf(start) : start + "->" + end);
        return res;
    }
}