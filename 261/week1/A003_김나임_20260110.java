import java.util.*;

public class A003_김나임_20260110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int[] digits = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}
