// hhttps://www.acmicpc.net/problem/2920

import java.util.Scanner;

public class a007 {
    public static void main(String[] args) {
        new a007().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 8 notes (space-separated, 1–8): ");
        int[] input = new int[8];

        for (int i = 0; i < 8; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();

        String result = checkOrder(input);
        System.out.println(result);
    }

    private String checkOrder(int[] input) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                descending = false;
            } else if (input[i] < input[i - 1]) {
                ascending = false;
            }
        }

        if (ascending)
            return "ascending";
        if (descending)
            return "descending";
        return "mixed";
    }
}