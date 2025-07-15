
// https://leetcode.com/problems/valid-perfect-square/description/
import java.util.Scanner;

public class a039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Is perfect square? " + isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = 1L * mid * mid;
            if (sq == num)
                return true;
            if (sq < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}