// https://school.programmers.co.kr/learn/courses/30/lessons/12916

import java.util.Scanner;

public class a006 {
    public static void main(String[] args) {
        new a006().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter first character to count: ");
        char ch1 = sc.nextLine().toLowerCase().charAt(0);

        System.out.print("Enter second character to count: ");
        char ch2 = sc.nextLine().toLowerCase().charAt(0);

        sc.close();

        boolean result = hasEqualCharCount(input, ch1, ch2);
        System.out.println("Are '" + ch1 + "' and '" + ch2 + "' counts equal? " + result);
    }

    // Counts occurrences of two characters and compares them
    private boolean hasEqualCharCount(String s, char ch1, char ch2) {
        s = s.toLowerCase();
        int count1 = 0, count2 = 0;

        for (char c : s.toCharArray()) {
            if (c == ch1)
                count1++;
            if (c == ch2)
                count2++;
        }

        return count1 == count2;
    }
}