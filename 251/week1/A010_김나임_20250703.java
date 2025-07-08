
// https://school.programmers.co.kr/learn/courses/30/lessons/60057

import java.util.Scanner;

public class a010 {
    public static void main(String[] args) {
        new a010().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string to compress: ");
        String s = sc.nextLine();
        int result = getLength(s);
        System.out.println(result);
        sc.close();
    }

    // Returns the shortest possible compressed length of the input string
    public int getLength(String s) {
        int minLength = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, unit);
            int count = 1;

            for (int i = unit; i <= s.length(); i += unit) {
                int end = Math.min(i + unit, s.length());
                String current = i + unit <= s.length() ? s.substring(i, end) : "";

                if (prev.equals(current)) {
                    count++;
                } else {
                    if (count > 1)
                        compressed.append(count);
                    compressed.append(prev);
                    prev = current;
                    count = 1;
                }
            }

            compressed.append(prev); // Append last leftover
            minLength = Math.min(minLength, compressed.length());
        }

        return minLength;
    }
}
