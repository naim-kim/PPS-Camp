
// https://leetcode.com/problems/sqrtx/
import java.util.Scanner;

public class a038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println("floor(sqrt(x)) = " + floorSqrt(x));
    }

    private static int floorSqrt(int x) {
        int left = 0, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = 1L * mid * mid;
            if (sq <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}