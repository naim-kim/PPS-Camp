
// https://www.acmicpc.net/problem/1427
import java.util.*;

public class a066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}