
// https://leetcode.com/problems/self-dividing-numbers/description/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left: ");
        int left = sc.nextInt();
        System.out.print("Enter right: ");
        int right = sc.nextInt();
        sc.close();

        List<Integer> ans = getSelfDividing(left, right);
        System.out.println(ans);
    }

    private static List<Integer> getSelfDividing(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int x = left; x <= right; x++) {
            if (isSelfDividing(x))
                res.add(x);
        }
        return res;
    }

    private static boolean isSelfDividing(int x) {
        int temp = x;
        while (temp > 0) {
            int d = temp % 10;
            if (d == 0 || x % d != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
}