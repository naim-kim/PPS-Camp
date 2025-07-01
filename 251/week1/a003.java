// https://leetcode.com/problems/plus-one/

import java.util.*;

public class a003 {
    public static void main(String[] args) {
        int[] digits = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]++ < 9) {
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