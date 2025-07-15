
// https://leetcode.com/problems/power-of-four/description/
import java.util.Scanner;

public class a025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Is power of four? " + isPowerOfFour(n));
        sc.close();
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
