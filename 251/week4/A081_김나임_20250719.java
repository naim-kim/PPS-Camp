// https://www.acmicpc.net/problem/2693

import java.util.*;

public class a081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int[] nums = new int[10];
            for (int i = 0; i < 10; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(nums[7]); // 3rd largest = index 7
        }
        sc.close();
    }
}